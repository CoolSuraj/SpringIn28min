package com.suraj.in28min.code.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suraj.in28min.code.game.GameConfiguration;
import com.suraj.in28min.code.game.GameRunner;
import com.suraj.in28min.code.interfaceLoosecoupling.GameConsole;

public class App02GamingBasicUsingSpring {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(
				GameConfiguration.class)) {
			System.out.println(context.getBean("MarioGame"));
//			System.out.println(context.getBean("Pacman"));
//			System.out.println(context.getBean("SuperContra"));
			
			context.getBean(GameConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
