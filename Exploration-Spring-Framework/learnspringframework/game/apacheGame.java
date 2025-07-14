package com.simple.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class apacheGame implements GamingConsole {

	
	public void Up() {
		System.out.println("JUMP");
		
	}
	
	public void Down() {
		System.out.println("LOWER YOURSLEF");
		
	}
	
	public void Right() {
		System.out.println("Move to RIGHT");
	}
	public void Left() {
		System.out.println("FLIP BACKWARDS");
	}
	public static void main(String[] args) {
		

	}

}
