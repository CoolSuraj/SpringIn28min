package com.suraj.in28min.code.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.suraj.in28min.code.game.GameRunner;
import com.suraj.in28min.code.interfaceLoosecoupling.GameConsole;

@Configuration
@ComponentScan("com.suraj.in28min.code.game")
public class App04GamingBasicUsingSpring {
	
	

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(
				App04GamingBasicUsingSpring.class)) {

			
			context.getBean(GameConsole.class).up();
			// this will give Null pointer Exception if GameRunner Class is having default constructor 
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
