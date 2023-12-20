package com.suraj.in28min.code.Servcies;

import org.springframework.stereotype.Component;

import com.suraj.in28min.code.interfaces.DataService;

@Component
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[]{1, 2, 3, 4, 5};
	}

}
