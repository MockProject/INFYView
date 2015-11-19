/**
 * 
 */
package com.mock.infyview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mock.infyview.model.LoginForm;


/**
 * @author Sabyasachi_Maitra
 *
 */
@Controller
public class LoginController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String rootController(){
		return "redirect:" + "/dashboard";
	}
	
	//Spring Security see this :
			@RequestMapping(value = "/login", method = RequestMethod.GET)
			public ModelAndView getLoginForm(
				@RequestParam(value = "error", required = false) String error,
				@RequestParam(value = "logout", required = false) String logout) {

				ModelAndView model = new ModelAndView();
				if (error != null) {
					model.addObject("errmessage", "Invalid username and password!");
				}

				if (logout != null) {
					model.addObject("successmessage", "You've been logged out successfully.");
					model.addObject("infomessage", "Please login again to continue");
				}
				model.addObject("command", new LoginForm());
				model.setViewName("login");
				
				return model;
			}
			
	
	/*@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginForm(HttpServletRequest req, HttpServletResponse res, Model model){
		
		//model.addAttribute("errmessage", "Bad credentials!");
		model.addAttribute("command", new LoginForm());
		return "login";
		//return new ModelAndView("login","command",new LoginForm());	
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String validateLogin(@ModelAttribute LoginForm form, 
            Model model, HttpServletRequest req, HttpServletResponse res){
		
		form = LoginValidation.validateLogin(form);
		
		if(form==null){
			model.addAttribute("errmessage", "Bad credentials!");
			//return "redirect:" + "/login";
			return getLoginForm(req, res, model);
		}
		else{
			//Creating userObj to persist in session
			UserObject uo = new UserObject();
			uo.setAcesslevel(form.getUsername());
			SessionObjectsInterface.saveToSession(req, res, uo);
		
			if(form.getUsername().equalsIgnoreCase("CEO")) return "redirect:" + "/dashboard";
			else return "redirect:" + "/settings";
			
			return (form.getUsername().equalsIgnoreCase("CEO")) ? "redirect:" + "/dashboard" : "redirect:" + "/settings";
		}
		
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest req, HttpServletResponse res, Model model){
		
		//model.addAttribute("errmessage", "Bad credentials!");
		
		model.addAttribute("successmessage", "Logged out Successfully!");
		model.addAttribute("infomessage", "Please login again to continue!");
		return getLoginForm(req, res, model);
		//return new ModelAndView("login","command",new LoginForm());	
	}*/
}
