package com.suraj.in28min.code.game;

import com.suraj.in28min.code.interfaceLoosecoupling.GameConsole;

public class SuperContra implements GameConsole{
	public void up() {
		System.out.println("Up");
	}

	public void down() {
		System.out.println("Sit down");
	}

	public void left() {
		System.out.println("Go back");
	}

	public void right() {
		System.out.println("shoot");
	}
}