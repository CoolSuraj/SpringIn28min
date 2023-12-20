package com.suraj.in28min.code.game;

import org.springframework.stereotype.Component;

import com.suraj.in28min.code.interfaceLoosecoupling.GameConsole;
@Component
public class GameRunner {

	/**
	 * use interface GameConsole to make Slightly Loose Coupling
	 */

	public GameConsole console; // Slightly Loose Coupling due to this interface

	public GameRunner(/*@Qualifier("MarioGame") can be used if the same used at particular class which needs to run*/GameConsole console) {

		this.console = console;
	}

	public void run() {
		System.out.println("Running game :" + console);
		console.up();
		console.down();
		console.right();
		console.left();
	}

}
