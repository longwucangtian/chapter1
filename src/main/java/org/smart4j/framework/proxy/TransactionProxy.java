package org.smart4j.framework.proxy;

import java.lang.reflect.Method;

import org.junit.internal.MethodSorter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.framework.annotation.Transaction;

import com.mysql.fabric.xmlrpc.base.Data;

public class TransactionProxy implements Proxy {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(TransactionProxy.class);
	
	private static final ThreadLocal<Boolean> FLAG_HOLDER = new ThreadLocal<Boolean>(){
		@Override
		protected Boolean initialValue(){
			return false;
		}
	};
	
	
	
	@Override
	public Object doProxy(ProxyChain proxyChain) throws Throwable {
		Object result;
		Boolean flag = FLAG_HOLDER.get();
		Method method = proxyChain.getTargetMethod();
		if(!flag && method.isAnnotationPresent(Transaction.class)){
			FLAG_HOLDER.set(true);
			try{
				DatabaseHelper.beginTransaction();
				LOGGER.debug("begin transaction");
				result = proxyChain.doProxyChain();
				DatabaseHelper.commitTransaction();
				LOGGER.debug("commit transaction");
			}catch(Exception e){
				DatabaseHelper.rollBackTransaction();
				LOGGER.debug("rollback transaction");
				throw e;
			}
			finally {
				FLAG_HOLDER.remove();
			}
		}else{
			result = proxyChain.doProxyChain();
		}
		return result;
	}

}
