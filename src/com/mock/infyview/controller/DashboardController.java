/**
 * 
 */
package com.mock.infyview.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mock.infyview.hpcc.HPCCEmpPercentageBean;
import com.mock.infyview.hpcc.HPCCRoxieServiceClientController;
import com.mock.infyview.model.UserObject;
import com.mock.infyview.util.SessionObjectsInterface;

/**
 * @author Sabyasachi_Maitra
 *
 */
@Controller
public class DashboardController {

	String roxieInput1="";
    String roxieInput2="";
    String roxieInput3="";
    String roxieInput4="";
    String roxieInput5="";
    
	@RequestMapping(value="/dashboard", method=RequestMethod.GET)
	public ModelAndView getDashboard(HttpServletRequest req, HttpServletResponse res){
		
		//make call to hpcc based on values saved in UserObj
		UserObject uo = SessionObjectsInterface.getFromSession(req, res);
		
		if(uo.getAcesslevel().equalsIgnoreCase("CEO")){
        	roxieInput1="Yes";
        }
        else if(uo.getAcesslevel().equalsIgnoreCase("DM")){
        	roxieInput2 = uo.getSelectedDCValue().toUpperCase();
        	roxieInput3 = uo.getSelectedDUValue();
        }
        else if(uo.getAcesslevel().equalsIgnoreCase("UnitHead")){
        	roxieInput5 = uo.getSelectedUnitDetails();
        }
        
        HPCCRoxieServiceClientController hrsContrl= new HPCCRoxieServiceClientController();
        ArrayList<HPCCEmpPercentageBean> hpccBean = new ArrayList<HPCCEmpPercentageBean>();
		try {
			hpccBean = hrsContrl.getEmployeeData(roxieInput1,roxieInput2,roxieInput3,roxieInput4,roxieInput5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        String benchVal = getPercentDataFromHPCCBean(hpccBean,"bench");
        String buffVal = getPercentDataFromHPCCBean(hpccBean,"buffer");
        String prodVal = getPercentDataFromHPCCBean(hpccBean,"production");
		
		/*String benchVal = "30";
		String buffVal = "20";
		String prodVal = "50";*/
		
		ModelAndView mv = new ModelAndView("dashboard");
		mv.addObject("banchPercentVal", benchVal);
		mv.addObject("bufferPercentVal", buffVal);
		mv.addObject("prodPercentVal", prodVal);
		return mv;	
	}
	
	@RequestMapping(value="/piechart")
	public String getPieChart(){
		return "piechart";	
	}
	
	private String getPercentDataFromHPCCBean( ArrayList<HPCCEmpPercentageBean> hpccBean, String allocation){
		String returnPercentVal="";
		
		for(HPCCEmpPercentageBean bean : hpccBean){
			if(bean.getCurrentmapping().equalsIgnoreCase("BENCH") && allocation.equalsIgnoreCase("bench")){
				returnPercentVal = bean.getPercentage();
			}
			else if(bean.getCurrentmapping().equalsIgnoreCase("BUFFER") && allocation.equalsIgnoreCase("buffer")){
				returnPercentVal = bean.getPercentage();
			}
			else if(bean.getCurrentmapping().equalsIgnoreCase("PRODUCTION") && allocation.equalsIgnoreCase("production")){
				returnPercentVal = bean.getPercentage();
			}
			//else returnPercentVal="NA";
		}
		
		return (returnPercentVal.equals("")) ? "0" : returnPercentVal;
	}

	public String getRoxieInput1() {
		return roxieInput1;
	}

	public void setRoxieInput1(String roxieInput1) {
		this.roxieInput1 = roxieInput1;
	}

	public String getRoxieInput2() {
		return roxieInput2;
	}

	public void setRoxieInput2(String roxieInput2) {
		this.roxieInput2 = roxieInput2;
	}

	public String getRoxieInput3() {
		return roxieInput3;
	}

	public void setRoxieInput3(String roxieInput3) {
		this.roxieInput3 = roxieInput3;
	}

	public String getRoxieInput4() {
		return roxieInput4;
	}

	public void setRoxieInput4(String roxieInput4) {
		this.roxieInput4 = roxieInput4;
	}

	public String getRoxieInput5() {
		return roxieInput5;
	}

	public void setRoxieInput5(String roxieInput5) {
		this.roxieInput5 = roxieInput5;
	}
	
	
	
}