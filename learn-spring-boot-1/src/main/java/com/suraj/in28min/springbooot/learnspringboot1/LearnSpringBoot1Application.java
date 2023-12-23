package com.suraj.in28min.springbooot.learnspringboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.suraj.in28min.springbooot.*")
public class LearnSpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBoot1Application.class, args);
	}

}
