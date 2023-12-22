package com.suraj.in28min.code.main;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author admin
 * to Learn how Xml beans were configured  
 * we use xml file and ClassPathXmlApplicationContext(Path to Xml);
 */

public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {
		//Getting context from XML from src/main/Resources
		try (var context = new ClassPathXmlApplicationContext("contextConfig.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			//System.out.println(context.getBean("Hello"));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
