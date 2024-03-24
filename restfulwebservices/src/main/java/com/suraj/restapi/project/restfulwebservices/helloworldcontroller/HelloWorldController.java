package com.suraj.restapi.project.restfulwebservices.helloworldcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.restapi.project.restfulwebservices.dto.HelloWorld;

// This controller is Rest APi Exposer 
@RestController
public class HelloWorldController {
	
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
	
}
