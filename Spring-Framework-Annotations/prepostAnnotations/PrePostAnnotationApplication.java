package com.prepostAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	 SomeDependency someDependency;
	 public SomeClass(SomeDependency someDependency) {
		 super();
		 this.someDependency= someDependency;
		 System.out.println("All dependencies are ready!");
	 }
	 
	 // as soon as the dependency are wired this happens
	 // fetching data from db
	 @PostConstruct
	 public void initialze() {
		 someDependency.getReady();
	 }
	 @PreDestroy // just before the process ends this happens,  helpful in closing in db connection
	 public void cleanUp() {
		 System.out.println("Cleanup");
}

@Component
class SomeDependency {
	
	public void getReady() {
		System.out.println("SomeDependency is ready...");
	}
	
}
@Configuration
@ComponentScan
public class PrePostAnnotationApplication {

	
	public static void main(String[] args) {
		try(var context =
				new AnnotationConfigApplicationContext(PrePostAnnotationApplication.class)){
			
		}
	}
	
}
