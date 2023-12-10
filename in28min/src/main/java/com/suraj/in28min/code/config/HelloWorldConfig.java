package com.suraj.in28min.code.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/**
 * 
 * @author Suraj Gurav
 * configuration class for manging the beans
 */
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
	@Primary //using primary you are saying that if multiple people ask for Person you give this 
	public Person person() {
		var person = new Person("Suraj", 24);
		person.toString(); // this is given by Java itself not created !! Due to
							// Record
		return person;

	}
	
	@Bean(name="yourCustomName")//can give custom name like this 
	@Primary
	Address address() {
		return new Address("Baker Street", "London");
	};
	
	@Bean(name="yourCustomName2")
	@Qualifier("usingQualifierForDemo")
	Address address2() {
		return new Address("Dwarka", "Gujrat");
	};
	
	@Bean  //we can give params like this as well.
	public Person PersonCall(String name,int age, Address yourCustomName/*using this as we have given  @Bean(name="yourCustomName") in above method*/) {
		System.out.println(yourCustomName.city()); //this is just to show how this works 
		return new Person("Surya",age());
	}
	
	@Bean  //we can set Qualifier to make sure that this object refers that one.
	public Person PersonCallWithQualifier(String name,int age, @Qualifier("usingQualifierForDemo") Address yourCustomName) {
		System.out.println(yourCustomName);//it will print from address2
		return new Person("Surya",age());
	}

}

record Address(String firstLine,String city) {};
