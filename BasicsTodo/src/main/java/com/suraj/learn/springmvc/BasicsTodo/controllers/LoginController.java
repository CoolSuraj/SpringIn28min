package com.suraj.learn.springmvc.BasicsTodo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.suraj.learn.springmvc.BasicsTodo.service.AuthenticationService;

/**
 * This method/Class is just basic UI of authentication
 * @author admin
 *
 */



//@Controller
//@SessionAttributes("name")/*this will ensure that this name attribute will stay till session completed
//but the condition is that we have to place over all the classes using this else we cannot use the value*/
public class LoginController {
//	/**
//	 * This is the logger to use, from slf4j
//	 */
//	private Logger logger = LoggerFactory.getLogger(getClass());
//	/**
//	 * This is to authenticate if user pass is good or not
//	 */
//	@Autowired
//	private AuthenticationService auth;


	
	/**
	 * using RequestMethod.GET to use this only for GET not for POST so post methods will fail
	 * to handle post we need to handle with different method
	 * @return
	 */
//	@RequestMapping(value="loginPage",method = RequestMethod.GET)
//	public String goToLoginPage() {
//		return "login";
//	}
//	
	
	/**
	 * This method will handle POST method
	 * @return
	 */
//	@RequestMapping(value="loginPage",method = RequestMethod.POST)
//	public String goToWelcomePage(@RequestParam String name , @RequestParam String pass, ModelMap map) {
//		if (auth.authenticate(name, pass)) {
//			logger.info(pass+" "+name);
//			map.put("pass", pass);
//			map.put("name", name);
//			return "welcome";
//		}
//			map.put("errorMsg", "Invalid Credentials Please Try Again !!");
//			return "login";
//	
//	}
	
	/**
	 * localhost:8080/login?name=AdamSmith
	 * @return
	 */
//	@RequestMapping("loginPageGreet")
//	public String goToLoginPageGreet(@RequestParam String name
//			/*?name is there hence we take name as variable */ 
//			, ModelMap model) {
//		logger.debug("Request param is {}",name);//will print at debug level
//		logger.info("Request param is {}",name);//will print at info level
//		//System.out.println("Request param is "+name); //SYSOUT NOT RECOMENDED IS PROD
//		/**
//		 * ModelMap is something which is used to send value to frontEnd
//		 */
//		model.put("name", name);
//		return "loginGreet";
//	}

	
	
	
}
