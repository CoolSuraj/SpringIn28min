package com.suraj.learn.springmvc.BasicsTodo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String user, String pass) {

		boolean isValidUser = user.equalsIgnoreCase("suraj");
		boolean isValidPass = pass.equalsIgnoreCase("ggIsOG");
		return isValidPass && isValidUser;
	}

}
