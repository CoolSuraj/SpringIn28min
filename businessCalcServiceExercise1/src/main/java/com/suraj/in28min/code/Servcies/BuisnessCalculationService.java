package com.suraj.in28min.code.Servcies;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.suraj.in28min.code.interfaces.DataService;

@Component
public class BuisnessCalculationService {

	private DataService dataService;
	
	

	public BuisnessCalculationService(DataService dataService) {

		this.dataService = dataService;
	}



	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

}
