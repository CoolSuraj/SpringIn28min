package com.suraj.in28min.code.Servcies;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.suraj.in28min.code.interfaces.DataService;

@Service // This class is having some buisness logic so we use this!
public class BuisnessCalculationService {

	private DataService dataService;

	public BuisnessCalculationService(DataService dataService) {

		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

}
