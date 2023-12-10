package com.suraj.in28min.code.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suraj.in28min.code.config.HelloWorldConfig;
import com.suraj.in28min.code.config.Person;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//Launch a spring context
		//configure the things we want spring handle
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		System.out.println(context.getBean("name"));  //name is method defined in config class and sysout is to print the returned by method
		System.out.println(context.getBean("age"));  //name is method defined in config class and sysout is to print the returned by method
		
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("yourCustomName"));
		//but you cannot use below thing directly as it might give exception: expected single matching bean but found 2: person,PersonCall
		//System.out.println(context.getBean(Person.class));//will get bean based on type
		/*But We have a solution as well and to make one method as Primary in config class  here made person() as primary */
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean("PersonCall"));
		
		/**
		 * to call all beans we use
		 */
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);;
		
		
	}

}
