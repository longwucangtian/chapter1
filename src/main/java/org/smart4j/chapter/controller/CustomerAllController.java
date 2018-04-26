package org.smart4j.chapter.controller;

import java.util.List;

import org.smart4j.chapter.model.Customer;
import org.smart4j.chapter.service.CustomerService;
import org.smart4j.framework.annotation.Action;
import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.bean.Data;
import org.smart4j.framework.bean.Param;
import org.smart4j.framework.bean.View;



@Controller
public class CustomerAllController {
	@Inject
	private CustomerService customerService;
	
	/** 
	 * 进入 客户列表 界面
	 */
	@Action("get:/customer")
	public View index(){
		List<Customer> customerList = customerService.getCustomerList();
		return new View("customer.jsp").addModel("customerList",customerList);
	}
	
	/**
	 * 处理 创建客户  请求
	 */
	@Action("post:/customer_create")
	public Data createSubmit(Param param){

		
		return null;
	}
}
