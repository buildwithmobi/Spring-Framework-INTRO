package com.simple.learnspringframework.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.simple.learnspringframework.game.apacheGame;
import com.simple.learnspringframework.game.gameRunner;
import com.simple.learnspringframework.game.marioGame;


@Component
class YourBusinessClass{
	//field injection
	// getter/setter injection
	// thru also constructor - auto wired is not necessary - preferred
	Dependency1 dependency1;
	Dependency2 dependency2;
	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		this.dependency1 = dependency1;
	}

	
	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		this.dependency2 = dependency2;
	}

	
	public String toString() {
		return "Using "+ dependency1+ " and "+ dependency2;}
} 

@Component
class Dependency1{}
@Component
class Dependency2{}

@Configuration
@ComponentScan
public class DepinjectionLauncherApplicaion {
	
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext
				(DepinjectionLauncherApplicaion.class);
		
	Arrays.stream(context.getBeanDefinitionNames())
	.forEach(System.out::println);
	
	System.out.println(context.getBean(YourBusinessClass.class));
		

	}

}
