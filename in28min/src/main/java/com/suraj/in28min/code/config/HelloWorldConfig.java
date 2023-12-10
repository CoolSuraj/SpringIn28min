package com.suraj.in28min.code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//configuration class for manging

@Configuration
public class HelloWorldConfig {

	@Bean // this creates bean which is managed by Spring
	public String name() {
		return "suraj";
	}

	@Bean
	public int age() {
		return 24;
	}

	@Bean
	public Person person() {
		var person = new Person("Suraj", 24);
		person.toString(); // this is given by Java itself not created !! Due to
							// Record
		return person;

	}
	
	@Bean
	Address address() {
		return new Address("Baker Street", "London");
	};

}

record Address(String firstLine,String city) {};
