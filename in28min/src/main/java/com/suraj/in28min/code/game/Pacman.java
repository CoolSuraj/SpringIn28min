package com.suraj.in28min.code.game;

import com.suraj.in28min.code.interfaceLoosecoupling.GameConsole;

public class Pacman implements GameConsole {

	@Override
	public void up() {
		System.out.println("move up");

	}

	@Override
	public void down() {
		System.out.println("move down");

	}

	@Override
	public void left() {
		System.out.println("move left");

	}

	@Override
	public void right() {
		System.out.println("move right");

	}

}
