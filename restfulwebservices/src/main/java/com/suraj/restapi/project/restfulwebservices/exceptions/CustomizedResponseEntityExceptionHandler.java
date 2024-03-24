package com.suraj.restapi.project.restfulwebservices.exceptions;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * this annotoation makes this class applicable across all the controllers 
 * @author admin
 *
 */

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler
		extends
			ResponseEntityExceptionHandler {
	
	
	/**
	 * This method is giving custom Exception to user and not what Spring gives by default
	 * @param ex
	 * @param request
	 * @return
	 * @throws Exception
	 */
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetails> handleAllException(Exception ex, WebRequest request) throws Exception {
		ErrorDetails error = new ErrorDetails(LocalDate.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error , HttpStatus.INTERNAL_SERVER_ERROR);
	}
	/**
	 * This will specially handle User Not Found Exception
	 * that too in custom class way that is ErrorDetails
	 * @param ex
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<ErrorDetails> handleUserNotFoundException(Exception ex, WebRequest request) throws Exception {
		ErrorDetails error = new ErrorDetails(LocalDate.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error , HttpStatus.NOT_FOUND);
	}
	

}
