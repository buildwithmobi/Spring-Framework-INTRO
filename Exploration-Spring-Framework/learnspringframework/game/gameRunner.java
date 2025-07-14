package com.simple.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
// removes the requirements of manually creating instaces
public class gameRunner  {
	GamingConsole game;
	// losely coupled
	public gameRunner(GamingConsole game) {
		this.game= game;
	}
	

	


	public void  run() {
		//Losely Bound
		game.Up();
		game.Down();
		game.Left();
		game.Right();
	}
	
	public static void main(String[] args) {
		

	}

}
