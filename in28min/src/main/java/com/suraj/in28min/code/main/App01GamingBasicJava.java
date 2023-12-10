package com.suraj.in28min.code.main;

import com.suraj.in28min.code.game.GameRunner;
import com.suraj.in28min.code.game.MarioGame;
import com.suraj.in28min.code.game.Pacman;
import com.suraj.in28min.code.game.SuperContra;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// var is keyword to get Datatype based on context introduced in Java 10
		// var marioGame = new MarioGame();
		/**
		 * GameConsole interface now do not need any change in GameRunner Class to run
		 * both games
		 */
		/*
		 * var game1 = new MarioGame(); 
		 * var gameRunner1 = new GameRunner(game1); // This will have gameRunner refer to SuperContra gameRunner1.run();
		 */
		var game = new Pacman(); // this represents: GameConsole game = new MarioGame();

		var gameRunner = new GameRunner(game); // This will have gameRunner refer to marioGame
		
		

	}

}
