package com.simple.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class marioGame implements GamingConsole  {

	
	
	public void Up() {
		System.out.println("Up");
	}
	
	
	public void Down() {
		System.out.println("Down");
	}
	public void Right() {
		System.out.println("Turn Right");
	}
	public void Left() {
		System.out.println("Turn Left");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
