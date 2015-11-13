/**
 * 
 */
package com.mock.infyview.model;

/**
 * @author Sabyasachi_Maitra
 *
 */
public class LoginForm {
	
	String username=null;
	String password=null;
	
	
	public LoginForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginForm(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
