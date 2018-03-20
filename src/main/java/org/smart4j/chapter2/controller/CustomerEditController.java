package org.smart4j.chapter2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customer_edit")
public class CustomerEditController extends HttpServlet{

	//进入修改用户界面
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response
			) throws ServletException, IOException{
		
		
	}
	
	//处理修改客户请求
	@Override
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response
			) throws ServletException, IOException{
			
	}
}
