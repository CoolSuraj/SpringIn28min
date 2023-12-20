package com.suraj.in28min.code.game;

import org.springframework.stereotype.Component;

import com.suraj.in28min.code.interfaceLoosecoupling.GameConsole;

@Component
public class MarioGame implements GameConsole {
	
	public void up() {
		System.out.println("Jump-mario");
	}
	public void down() {
		System.out.println("Go into a hole -mario");
	}
	public void left() {
		System.out.println("Go back -mario");
	}
	public void right() {
		System.out.println("Accelrate-mario");
	}

}
