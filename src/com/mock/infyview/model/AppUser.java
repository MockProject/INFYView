	/**
 * 
 */
package com.mock.infyview.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Saby
 *
 */
public class AppUser {
	private String userName;
	private String password;
	private boolean enabled;
	private Set<AppUserRole> userRole = new HashSet<AppUserRole>(0);
	
	public AppUser() {}
	
	public AppUser(String userName, String password, boolean enabled) {
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
	}

	public AppUser(String userName, String password, boolean enabled, Set<AppUserRole> userRole) {
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
		this.userRole = userRole;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<AppUserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<AppUserRole> userRole) {
		this.userRole = userRole;
	}
		
}
