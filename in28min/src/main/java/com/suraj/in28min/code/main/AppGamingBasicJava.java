package com.suraj.in28min.code.main;

import com.suraj.in28min.code.game.GameRunner;
import com.suraj.in28min.code.game.MarioGame;
import com.suraj.in28min.code.game.SuperContra;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// var is keyword to get Datatype based on context introduced in Java 10
		//var marioGame = new MarioGame();
		var superContra  = new SuperContra();
		var gameRunner = new GameRunner(superContra); //This will have gameRunner refer to marioGame 
		gameRunner.run(); //run called for marioGame ?
		
		

	}

}
