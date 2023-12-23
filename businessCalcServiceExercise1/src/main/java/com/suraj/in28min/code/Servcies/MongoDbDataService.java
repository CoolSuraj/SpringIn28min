package com.suraj.in28min.code.Servcies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.suraj.in28min.code.interfaces.DataService;

//@Component
@Primary
@Repository  //as this class is talking with Db this annotation is recommended !!
public class MongoDbDataService implements DataService {

	@Override
	public int[] retrieveData() {

		return new int[]{11, 22, 33, 44, 55};
	}

}
