package com.suraj.learn.springmvc.BasicsTodo.controllers;

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
		model.put("name", "surya");
		return "welcome";
	}
}
