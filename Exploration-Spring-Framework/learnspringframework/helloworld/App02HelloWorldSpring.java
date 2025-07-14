package com.simple.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//pojo = plain old java object
		
		//launch a Spring Context
		// spring containers takes your classes as your input and creates a running system 
		// bean factory is basic container - might be used for iot device memory constraints 
		try(var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
		{
			// there have use application context, for enterprise application
			//configure the things that we want Spring to manage 0 configuration
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("proffession"));
			System.out.println(context.getBean("person"));
			
			//using the Address class instead using the name of bean
			System.out.println(context.getBean("myContact"));
			// using existing beans inside another bean thru method
			System.out.print("bean thru Method call: ");
			System.out.println(context.getBean("personDetails"));
			//using existing beans inside another bean thru parameters
			System.out.print("bean thru parameter: ");
			System.out.println(context.getBean("personInformation"));
			
			System.out.println(context.getBean(Address.class));
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		}
		
		
		
	}

}
