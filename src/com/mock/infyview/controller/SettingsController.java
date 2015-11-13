/**
 * 
 */
package com.mock.infyview.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mock.infyview.model.SettingsForm;
import com.mock.infyview.model.UserObject;
import com.mock.infyview.util.SessionObjectsInterface;

/**
 * @author Sabyasachi_Maitra
 *
 */
@Controller
public class SettingsController {

	@RequestMapping(value="/settings", method=RequestMethod.GET)
	public ModelAndView getSettingsPage(ModelAndView mv){
		mv.addObject("SettingsForm", new SettingsForm());
		mv.addObject("dcList",UserObject.getDCDetails());
		mv.addObject("duList", UserObject.getDUDetails());
		mv.addObject("unitList", UserObject.getUnitDetails());
		return mv;	
	}
	@RequestMapping(value="/settings", method=RequestMethod.POST)
	public String postSettingsPage(@ModelAttribute SettingsForm form, HttpServletRequest req, HttpServletResponse res){
		
		UserObject uo = SessionObjectsInterface.getFromSession(req, res);
		uo.setSelectedDCValue(form.getDcValue());
		uo.setSelectedDUValue(form.getDuValue());
		uo.setSelectedUnitDetails(form.getUnitValue());
		SessionObjectsInterface.saveToSession(req, res, uo);
		return "redirect:" + "/dashboard";
	}
}
