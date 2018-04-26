package org.smart4j.plugin.security;

import java.util.Set;

/**
 * Smart Security 接口
 * <br/>
 * 可在应用中实现该接口，或者在smart.properties文件中提供以下基于SQL的配置项：
 * <ul>
 * 		<li>smart.plugin.security.jdbc.authc_query:根据用户名获取密码</li>
 * 		<li>smart.plugin.security.jdbc.roles_query：根据用户名获取角色名集合</li>
 * 		<li>smart.plugin.secruity.jdbc.permissions_query：根据角色名获取权限名集合</li> 
 * </ul>
 * @author luyc
 *
 */
public interface SmartSecurity {

	/**
	 * 根据用户名获取密码
	 */
	String getPassWord(String name);
	
	/**
	 * 根据用户名获取角色名集合
	 */
	Set<String> getRoleNameSet(String userName);
	
	/**
	 * 根据角色名获取权限名集合
	 */
	Set<String> getPermissionNameSet(String roleName);
	
}
