package com.suraj.in28min.code.game;

public class GameRunner {
	/**
	 * This is example to show tight coupling like
	 * You can take a laptop anywhere but not desktop that easily
	 * 
	 */
	public SuperContra game; //Everytime we have to change the class here for all games this is called Tight coupling
	
	public GameRunner(SuperContra superContra) {

		this.game = superContra; 
	}

	public GameRunner() {

	}

	public void run() {
		System.out.println("Running game: "+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
