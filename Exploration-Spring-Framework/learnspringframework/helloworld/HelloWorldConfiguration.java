package com.simple.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// don't need to make getter.setters
//from java 16 update
record Person (String name, int age, Address address) {} // attributes defined already here
record Address (String city, int StreetNo) {}
record Contact (String email, long phoneNumber) {}
@Configuration 
public class HelloWorldConfiguration {

	@Bean 
	public String name() {return "Harry Potter";}
	
	@Bean
	public int age() {return 20;}
	@Bean
	public String proffession() {return "Software Engineer";}
	
	@Bean
	public Person person() {
		var person = new Person("Mubashir",20,new Address("New Jersey",173));
		return person;
	}
	@Bean
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Kentucky",571);
	}
	@Bean(name="myContact")
	public Contact contact() {
		var contact = new Contact("mubashir@hotmail.com",238588484);
		return contact;
	}
	// thru method call use existing beans inside another bean
	@Bean
	public Person personDetails() {
		// now using the existing beans we are further utilizing them in new bean 
		return new Person(name(),age(),address()); // name and age
	}
	// thru parameters making use of existing beans
	@Bean
	public Person personInformation(String name, int age, @Qualifier("address3qualifier") Address address) {// parameters as  methods name
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person2() {
		var person = new Person("Mubashir",20,new Address("New Jersey",173));
		return person;
	}
	@Bean
	public Address address() {
		var address = new Address("New Jersey",173);
		return address;
	}
	@Bean
	@Primary
	public Address address2() {
		return new Address("Lonodon",991);
	}
	
	
	
	
	
	
}
