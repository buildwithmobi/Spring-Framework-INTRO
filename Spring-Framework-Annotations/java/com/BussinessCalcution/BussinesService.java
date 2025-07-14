package com.BussinessCalcution;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BussinesService {
	private DataService dataService;
	
	public BussinesService(DataService dataService) {
		super();
		this.dataService =dataService;
	}
	
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData())
				.max().orElse(0);
	}

}
