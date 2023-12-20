package com.suraj.in28min.code.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.suraj.in28min.code.interfaceLoosecoupling.GameConsole;
/* Comment Component for App01,App02,App03 in com.suraj.in28min.code.main**/
@Component   //this is to let spring know that it should manage this particular class
@Primary
public class Pacman implements GameConsole {

	@Override
	public void up() {
		System.out.println("move up -pacman");

	}

	@Override
	public void down() {
		System.out.println("move down -pacman");

	}

	@Override
	public void left() {
		System.out.println("move left -pacman");

	}

	@Override
	public void right() {
		System.out.println("move right -pacman");

	}

}
