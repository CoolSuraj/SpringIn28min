package com.suraj.in28min.code.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suraj.in28min.code.config.HelloWorldConfig;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//Launch a spring context
		//configure the things we want spring handle
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		System.out.println(context.getBean("name"));  //name is method defined in config class and sysout is to print the returned by method
		System.out.println(context.getBean("age"));  //name is method defined in config class and sysout is to print the returned by method
		
		System.out.println(context.getBean("person"));
		
		
		
		
		
	}

}
