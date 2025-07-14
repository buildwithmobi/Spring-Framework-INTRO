package com.simple.learnspringframework.a0;

import java.util.Arrays;

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
@ComponentScan
public class DepinjectionLauncherApplicaion {
	
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext
				(DepinjectionLauncherApplicaion.class);
		
	Arrays.stream(context.getBeanDefinitionNames())
	.forEach(System.out::println);
		

	}

}
