package org.smart4j.chapter2.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

public class CustomerServiceTest {
	
	private final CustomerService customerService;
	
	public CustomerServiceTest(){
		customerService = new CustomerService();
	}
	
	@Before
	public void init() throws Exception{
		/*String file = "sql/customer_init.sql";
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(file);
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String sql;
		while((sql = reader.readLine()) != null){
			DatabaseHelper.executeUpdate(sql);
		}*/
		
		DatabaseHelper.executeSqlFile("sql/customer_init.sql");
	}
	
	@Test
	public void getCustomerListTest() throws Exception{
		List<Customer> list = customerService.getCustomerList();
		
	}
	
	
}
