package com.suraj.in28min.code.game;

public class GameRunner {

	public MarioGame game;

	public GameRunner(MarioGame game) {

		this.game = game; 
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
