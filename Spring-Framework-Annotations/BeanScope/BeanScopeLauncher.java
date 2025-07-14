package com.SpringFrameWork.BeanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component // singleton bean
class NormalClass{}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass{}


@Configuration
@ComponentScan
public class BeanScopeLauncher {

	public static void main(String[] args) {
		
		try(var context =
				new AnnotationConfigApplicationContext(BeanScopeLauncher.class)){
			// hash code will be printed same for both cases 
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			// for each time we are getting new hash code - new instance
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}
	}

}
