package com.suraj.in28min.code.interfaceLoosecoupling;

import org.springframework.stereotype.Component;


public interface GameConsole {
	
	public static void getClassName() {
		System.out.println("Representing "+ GameConsole.class +" class");
	}

	public void up();

	public void down();

	public void left();

	public void right();

}
