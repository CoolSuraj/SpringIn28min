package com.suraj.learn.springmvc.BasicsTodo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	/**
	 * This is the logger to use, from slf4j
	 */
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("loginPage")
	public String goToLoginPage() {
		return "login";
	}
	/**
	 * localhost:8080/login?name=AdamSmith
	 * @return
	 */
	@RequestMapping("loginPageGreet")
	public String goToLoginPageGreet(@RequestParam String name
			/*?name is there hence we take name as variable */ 
			, ModelMap model) {
		logger.debug("Request param is {}",name);//will print at debug level
		logger.info("Request param is {}",name);//will print at info level
		//System.out.println("Request param is "+name); //SYSOUT NOT RECOMENDED IS PROD
		/**
		 * ModelMap is something which is used to send value to frontEnd
		 */
		model.put("name", name);
		return "login";
	}
	
}
