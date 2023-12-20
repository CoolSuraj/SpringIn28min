package com.suraj.in28min.code.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.suraj.in28min.code.Servcies.BuisnessCalculationService;

@Configuration
@ComponentScan("com.suraj.in28min.* ")
public class BusinessCalculationMainApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(
				BusinessCalculationMainApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames())
					.forEach(System.out::println);
			
			System.out.println( context.getBean(BuisnessCalculationService.class).findMax() );

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
