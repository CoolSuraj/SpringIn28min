package com.suraj.restapi.project.restfulwebservices.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * @ResponseStatus Marks a method or exception class with the status code and reason that should be returned. 

The status code is applied to the HTTP response when the handlermethod is invoked, but does not override status information set by other means,
 such as ResponseEntity or "redirect:". 

 * @author admin
 *
 */
@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	
	
	private static final long serialVersionUID = 5071929685267312789L;
	/**
	 * When Ever this Exception called automatically 404 Not Found will be there
	 */
	public UserNotFoundException(String message) {
		super(message);
	}
	//when we disable spring-boot-devtools extra logs/Stack trace will be gone
	//or when you run as Java Jar file Spring boot DevTools is disabled

}
