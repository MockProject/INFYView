/**
 * 
 */
package com.mock.infyview.model;

/**
 * @author Saby
 *
 */
public class AppUserRole {

	private AppUser appUser;
	private String role;
	
	public AppUserRole(){}
	
	public AppUserRole(AppUser appUser, String role){
		this.appUser = appUser;
		this.role = role;
	}

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
