package com.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;



@Component
class ClassA{}
// by default beans are eagerly eager initialized - recommended 
@Component
@Lazy // now initialization is not done unless class bean is used
class ClassB{
	
	// dependency injection
	private ClassA classA;
	// auto-wiring thru constructor
	public ClassB(ClassA classA) {
		System.out.println("some intialization logic running ....");
		this.classA= classA;
	}
	public void doSomething() {
		System.out.println("do something ..");
	}
}


@Configuration
@ComponentScan // lazy annotation also used here in complex
public class LazyIntializationLauncherApplication {
	public static void main(String[] args) {
		try(var context =
				new AnnotationConfigApplicationContext
				(LazyIntializationLauncherApplication.class)){
			
			System.out.println("Intializer ...");
			context.getBean(ClassB.class).doSomething();
		}
		
	}

}
