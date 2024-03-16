package com.suraj.learn.springmvc.BasicsTodo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	

	
	/**
	 * Using this method to redirect after login we will now use Spring Security to
	 * make login and authenticate
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goToLoginPageBase(ModelMap model) {
		model.put("name", getLoggedinUsername()); //to get username who logged in 
		return "welcome"; 
	}
	/**
	 * This method is something which gives username using  SecurityContextHolder.getContext().getAuthentication();
	 * @return username of user who logged in
	 */
	private String getLoggedinUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
