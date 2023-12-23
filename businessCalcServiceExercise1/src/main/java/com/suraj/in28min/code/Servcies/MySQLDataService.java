package com.suraj.in28min.code.Servcies;

import org.springframework.stereotype.Repository;

import com.suraj.in28min.code.interfaces.DataService;

@Repository  //as this class is talking with Db this annotation is recommended !!
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[]{1, 2, 3, 4, 5};
	}

}
