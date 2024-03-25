package com.suraj.restapi.project.restfulwebservices.helloworldcontroller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.restapi.project.restfulwebservices.dto.HelloWorld;

// This controller is Rest APi Exposer 
@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
	// for /hello-world we should return "Hello World" first Hello World API
	@RequestMapping(method=RequestMethod.GET , path ="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorld helloWorldBean() {
		return new HelloWorld("Hello World");
	}
	
	//Path Params
//	/users/{id}/todos/{id} ==>
	@GetMapping("/hello-world-bean/path-variable/{name}")
	public HelloWorld helloWorldBeanPathVariable(@PathVariable String name) {
		return new HelloWorld("Hello World "+name);
	}
	
	@RequestMapping(method=RequestMethod.GET , path ="/good-morning")
	public String GoodMorningInternational() {
		//for this to work you need to create messages_nl.properties for dutch and also need to add Accept-Language=nl in request headers
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "default Good Morning", locale);
	}
	
}
