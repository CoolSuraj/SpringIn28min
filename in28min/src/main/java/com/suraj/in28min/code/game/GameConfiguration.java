package com.suraj.in28min.code.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.suraj.in28min.code.interfaceLoosecoupling.GameConsole;

//@Configuration  //using spring 
public class GameConfiguration {
	
//	@Bean
//	@Primary
	public GameConsole MarioGame() {
		return new MarioGame();
	}
	
//	@Bean
	public GameRunner gamer(GameConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
//	@Bean(name="PacmanGame")
//	@Qualifier("PacmanGame")
//	public GameConsole Pacman() {
//		return new Pacman();
//	}
//	
//	@Bean
//	@Qualifier("SuperContraGame")
//	public GameConsole SuperContra() {
//		return new SuperContra();
//	}

}
