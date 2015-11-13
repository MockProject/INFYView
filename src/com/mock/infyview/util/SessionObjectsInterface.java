/**
 * 
 */
package com.mock.infyview.util;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mock.infyview.model.UserObject;

/**
 * @author Sabyasachi_Maitra
 *
 */
public class SessionObjectsInterface extends HttpServlet {

	public static void saveToSession(HttpServletRequest req, HttpServletResponse res, UserObject uo){
		
		HttpSession session = req.getSession();
		session.setAttribute("UserObject", uo);
	}
	
	public static UserObject getFromSession(HttpServletRequest req, HttpServletResponse res){
		
		UserObject uo = (UserObject) req.getSession().getAttribute("UserObject");
		return uo;
	}
}
