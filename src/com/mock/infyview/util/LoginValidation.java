/**
 * 
 */
package com.mock.infyview.util;

import java.util.*;

import com.mock.infyview.model.LoginForm;

/**
 * @author Sabyasachi_Maitra
 *
 */
public class LoginValidation {

	static protected List<LoginForm> loginList = new ArrayList<LoginForm>();
	
	public static void getLoginData(){
		
		loginList.add(new LoginForm("CEO","Infosys1"));
		loginList.add(new LoginForm("DM","Infosys2"));
		loginList.add(new LoginForm("UnitHead","Infosys3"));
		
	}
	
	public static LoginForm validateLogin(LoginForm form){
		getLoginData();
		for (LoginForm loginForm:loginList){
			if(loginForm.getUsername().equalsIgnoreCase(form.getUsername())
				&& loginForm.getPassword().equals(form.getPassword())){
				System.out.println(loginForm.getUsername());	
				return loginForm;
			}
		}
		return null;
	}
	
}
