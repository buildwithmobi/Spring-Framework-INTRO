package com.simple.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.simple.learnspringframework.game.apacheGame;
import com.simple.learnspringframework.game.gameRunner;
import com.simple.learnspringframework.game.marioGame;


@Configuration
// from that package
// create instances for that class 
@ComponentScan(" com.simple.learnspringframework.game")
public class GamingAppLauncherApplication {
	
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext
				(GamingAppLauncherApplication.class);
		
	
		context.getBean(GamingConsole.class).Up();
		context.getBean(GamingConsole.class).Down();
		context.getBean(gameRunner.class);
	

	}

}
