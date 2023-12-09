package com.suraj.in28min.code.game;

import com.suraj.in28min.code.interfaceLoosecoupling.GameConsole;

public class GameRunner {
	/*
	 * This is example to show tight coupling like You can take a laptop anywhere
	 * but not desktop that easily
	 * 
	 */
	// public SuperContra game; //Everytime we have to change the class here for all
	// games this is called Tight coupling

	/**
	 * use interface GameConsole to make Slightly Loose Coupling
	 */

	public GameConsole console; // Slightly Loose Coupling due to this interface

	public GameRunner(GameConsole console) {

		this.console = console;
	}

	public GameConsole getConsole() {
		return console;
	}

	public void setConsole(GameConsole console) {
		this.console = console;
	}

	public GameRunner() {
	}

	public void run() {
		System.out.println("Running game :" + console);
		console.up();
		console.down();
		console.right();
		console.left();
	}

}
