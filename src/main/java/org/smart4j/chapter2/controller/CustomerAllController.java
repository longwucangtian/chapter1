package org.smart4j.chapter2.controller;

import java.util.List;

import javax.swing.text.View;
import javax.xml.ws.Action;

import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import com.mysql.fabric.xmlrpc.base.Param;

@Controller
public class CustomerAllController {
	@Inject
	private CustomerService customerService;
	
	/** 
	 * 进入 客户列表 界面
	 */
	@Action("get:/customer")
	public View index(Param param){
		List<Customer> customerList = customerService.getCustomerList();
		return new View("customer.jsp").addModel("customerList",customerList);
	}
}
