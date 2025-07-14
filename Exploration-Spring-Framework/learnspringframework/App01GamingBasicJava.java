package com.simple.learnspringframework;

import com.simple.learnspringframework.game.apacheGame;
import com.simple.learnspringframework.game.gameRunner;
import com.simple.learnspringframework.game.marioGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		var game = new marioGame();
		//var game = new apacheGame();
		
		// game runner class needs a game
		// game is dependency
		// creation of object + wiring of dependencies
		
		
		var gamerunner = new gameRunner(game);
		
		gamerunner.run();
		

	}

}
