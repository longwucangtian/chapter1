package org.smart4j.chapter;

import java.util.Set;

import org.smart4j.plugin.security.SmartSecurity;

/**
 * 应用安全控制
 * @author luyc
 *
 */
public class AppSecurity implements SmartSecurity {

	@Override
	public String getPassWord(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getRoleNameSet(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getPermissionNameSet(String roleName) {
		// TODO Auto-generated method stub
		return null;
	}

}
