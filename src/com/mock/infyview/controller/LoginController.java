/**
 * 
 */
package com.mock.infyview.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mock.infyview.model.LoginForm;
import com.mock.infyview.model.UserObject;
import com.mock.infyview.util.LoginValidation;
import com.mock.infyview.util.SessionObjectsInterface;


/**
 * @author Sabyasachi_Maitra
 *
 */
@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView getLoginForm(HttpServletRequest req, HttpServletResponse res){
		
		//model.addAttribute("message", null);
		//model.addAttribute("command", new LoginForm());
		//return "login";
		return new ModelAndView("login","command",new LoginForm());	
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String validateLogin(@ModelAttribute LoginForm form, 
            Model model, HttpServletRequest req, HttpServletResponse res){
		
		form = LoginValidation.validateLogin(form);
		
		if(form==null){
			return "redirect:" + "/login";
		}
		else{
			//Creating userObj to persist in session
			UserObject uo = new UserObject();
			uo.setAcesslevel(form.getUsername());
			SessionObjectsInterface.saveToSession(req, res, uo);
		
			/*if(form.getUsername().equalsIgnoreCase("CEO")) return "redirect:" + "/dashboard";
			else return "redirect:" + "/settings";*/
			
			return (form.getUsername().equalsIgnoreCase("CEO")) ? "redirect:" + "/dashboard" : "redirect:" + "/settings";
		}
		
	}
	
	
}
