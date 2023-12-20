package com.suraj.in28min.code.game;

import org.springframework.stereotype.Component;

import com.suraj.in28min.code.interfaceLoosecoupling.GameConsole;

@Component
public class SuperContra implements GameConsole{
	public void up() {
		System.out.println("Up -contra");
	}

	public void down() {
		System.out.println("Sit down -contra");
	}

	public void left() {
		System.out.println("Go back -contra");
	}

	public void right() {
		System.out.println("shoot -contra");
	}
}
