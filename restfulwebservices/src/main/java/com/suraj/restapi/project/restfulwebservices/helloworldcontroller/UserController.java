package com.suraj.restapi.project.restfulwebservices.helloworldcontroller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.suraj.restapi.project.restfulwebservices.dao.UserDao;
import com.suraj.restapi.project.restfulwebservices.dto.User;

@RestController
public class UserController {
	
	@Autowired
	UserDao userDao;
	/**
	 * Use of ResponseEntity gives use flexibility to work with headers,status etc.
	 * @return
	 */
	@GetMapping("/users")
	public ResponseEntity<List<User>> retrieveAllUsers(){
		List<User> listUsers = userDao.findAll();
		
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(listUsers);
		
	}
	/**
	 * even if you do not use ResponseEntity still jackson Api will do it's job by default
	 * @param id
	 * @return
	 */
	@GetMapping("/users/{id}")
	public User retrieveUserById(@PathVariable int id){
		User user = userDao.findUserById(id);
		
		return user; //this will go as Json as response
		
	}
	
	/**
	 * Creating POst method to Create a New User
	 * @RequestBody User user -- means Json sent from requestor
	 */
	
	@PostMapping("/createuser")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		userDao.CreateUser(user);
		//this perticular thing will give this URI in headers
		URI location= URI.create(String.format("/users/%d", user.getId()));
		return ResponseEntity.created(location).build();     

	}
	
	
	
}
