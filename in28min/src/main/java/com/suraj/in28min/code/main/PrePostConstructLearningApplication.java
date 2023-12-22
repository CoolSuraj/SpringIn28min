package com.suraj.in28min.code.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Named;

@Component
class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All Dependecies Ready");
	}
	/**
	 * The @postConstruct used for initializing the method as soon as Bean are
	 * initialized(Autowired)
	 */
	@PostConstruct
	public void init() {
		someDependency.getReady();
	}
	/**
	 * This is invoked just before every bean getting closed !!
	 */
	@PreDestroy
	public void cleanUp() {
		System.out.println("CleanUp");
	}
}

@Named  // jakarta context dependency injection - 
class SomeDependency {

	public void getReady() {
		System.out.println("Some logic using SomeDependency");

	}

}

@Configuration
@ComponentScan
public class PrePostConstructLearningApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(
				PrePostConstructLearningApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
					.forEach(System.out::println);
		}

	}

}
