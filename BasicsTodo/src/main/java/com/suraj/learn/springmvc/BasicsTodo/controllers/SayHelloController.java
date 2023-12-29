package com.suraj.learn.springmvc.BasicsTodo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody // if this is not used spring-boot thinks returned string as view name
	public String sayHello() {
		return "Hello! What are you learning today ? ";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<!DOCTYPE html>");
		sb.append("<html> ");
		sb.append("<head>");
		sb.append(" <title>HTML from JSP</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append(" My first JSP View");
		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();
	}
	
	/**
	 * As Embedding HTML Like sayHelloHtml is not  easy hence we should go for jsp implementation as below
	 * for that we need to add this dependency and add suffix and prefix in application.properties
	 * <dependency>
	 * <groupId>org.apache.tomcat.embed</groupId>
	 * <artifactId>tomcat-embed-jasper</artifactId>
	 * <scope>provided</scope>
	 * </dependency>
	 * 
	 */
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		/**
		 * src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
		 */
		return "sayHello";  
	}
}
