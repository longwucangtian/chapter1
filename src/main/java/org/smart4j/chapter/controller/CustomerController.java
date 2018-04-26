package org.smart4j.chapter.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.smart4j.chapter.model.Customer;
import org.smart4j.chapter.service.CustomerService;

@WebServlet("/customer")
public class CustomerController extends HttpServlet{

	private CustomerService customerService;
	
	@Override
	public void init() throws ServletException {
		customerService = new CustomerService();
	}
	
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response
			) throws ServletException, IOException{
		List<Customer> customerList = customerService.getCustomerList();
		request.setAttribute("customerList", customerList);
		request.getRequestDispatcher("WEB-INF/view/customer.jsp").forward(request, response);
	}
	

	@Override
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response
			) throws ServletException, IOException{
			
	}
}
