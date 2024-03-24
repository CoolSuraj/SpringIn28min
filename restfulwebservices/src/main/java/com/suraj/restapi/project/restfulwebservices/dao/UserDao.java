package com.suraj.restapi.project.restfulwebservices.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.suraj.restapi.project.restfulwebservices.dto.User;

@Component
public class UserDao {

	// for now create static List and create all Dao component over that

	private static List<User> users = new ArrayList<>();
	
	static {
		//this block is running at the beginning of anything
		users.add(new User(1,"Name One",LocalDate.now().minusYears(25)));
		users.add(new User(2,"Name Two",LocalDate.now().minusYears(24)));
		users.add(new User(3,"Name Three",LocalDate.now().minusYears(23)));
		users.add(new User(4,"Name Four",LocalDate.now().minusYears(22)));
		users.add(new User(5,"Name Five",LocalDate.now().minusYears(21)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findUserById(int id) {
		return users.stream().filter(u->(u.getId()).equals(id)).findFirst().get();
	}
	
	public boolean CreateUser(User user) {
		boolean added =false;
		added = users.add(user);
		return added;
	}
	
	

}
