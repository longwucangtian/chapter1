package org.smart4j.chapter.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter.helper.DatabaseHelper;
import org.smart4j.chapter.model.Customer;

public class CustomerService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
	
	
	/*public List<Customer> getCustomerList (){
		Connection conn = null;
		try{
			List<Customer> list = new ArrayList<>();
			String sql = "select * from customer";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()){
				Customer customer = new Customer();
				customer.setId(rs.getLong("id"));
				customer.setName(rs.getString("name"));
				customer.setContact(rs.getString("contact"));
				customer.setEmail(rs.getString("email"));
				customer.setRemark(rs.getString("remark"));
				customer.setTelephone(rs.getString("telephone"));
				list.add(customer);
			}
			return list;
		}catch(SQLException e){
			LOGGER.error("excute sql failure",e);
		}
		return new ArrayList<>();
	}*/
	/**
	 * 获取客户列表
	 * @return
	 */
	public List<Customer> getCustomerList(){
		String sql = "select * from customer";
		return DatabaseHelper.queryEntityList(Customer.class, sql);
	}
	
	
	public List<Customer> getCustomerList (String keyWord){
		 return null;
	}
	/**
	 * 获取单列
	 * @param id
	 * @return
	 */
	public Customer getCustomer(Long id){
		String sql = "select * from customer where id = ? ";
		return DatabaseHelper.queryEntity(Customer.class, sql,id);
	}
	
	/**
	 * 新增客户信息
	 * @param map
	 * @return
	 */
	public boolean createCustomer(Map<String, Object> map){
		return DatabaseHelper.insertEntity(Customer.class, map);

	}
	/**
	 * 更新客户
	 * @param id
	 * @param map
	 * @return
	 */
	public boolean updateCustomer(Long id, Map<String, Object> map){
		return DatabaseHelper.updateEntity(Customer.class, id, map);

	}
	
	/**
	 * 删除客户
	 * @param id
	 * @return
	 */
	public boolean deleteCustomer(Long id){
		return DatabaseHelper.deleteEntity(Customer.class, id);
	}
}
