package com.CdiContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService {
	private DataService dataService;
	//@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	 public DataService getDataService() {
			System.out.println("Setter injection");
			return dataService;
	 }
	 
}
//@Component
@Named
class DataService{
	
}

@Configuration
@ComponentScan
public class CdiContextApplication {

	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(CdiContextApplication.class)){
			System.out.println(context.getBean(BusinessService.class).getDataService());
			
		}
		

	}

}
