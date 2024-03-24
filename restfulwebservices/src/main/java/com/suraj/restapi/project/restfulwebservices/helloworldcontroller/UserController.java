package com.suraj.restapi.project.restfulwebservices.helloworldcontroller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.restapi.project.restfulwebservices.dao.UserDao;
import com.suraj.restapi.project.restfulwebservices.dto.User;
import com.suraj.restapi.project.restfulwebservices.exceptions.UserNotFoundException;

import jakarta.validation.Valid;

@RestController
public class UserController {
	/**
	 * springdoc-openapi java library helps to automate the 
	 * generation of API documentation for spring boot projects. 
	 */
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
	 * 
	 * @GetMapping("/users/{id}")
	public User retrieveUserById(@PathVariable int id){
		User user = userDao.findUserById(id);
		
		return user; //this will go as Json as response
		
	}
	 */
	@GetMapping("/users/{id}")
	public User retrieveUserById(@PathVariable int id){
		
		User user = userDao.findUserById(id);
		
		if(user == null)
		{
			throw new UserNotFoundException("user id "+id);
		}
		
		return user; //this will go as Json as response
		
	}
	
	/**
	 * Creating POst method to Create a New User
	 * @RequestBody User user -- means Json sent from requestor
	 */
	
	@PostMapping("/createuser")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		userDao.CreateUser(user);
		//this perticular thing will give this URI in headers
		URI location= URI.create(String.format("/users/%d", user.getId()));
		return ResponseEntity.created(location).build();     

	}
	
	
	@DeleteMapping("/users/delete/{id}")
	public String deleteUserById(@PathVariable int id){
		//This is not at all required I am just creating for additional info
		boolean deleted = userDao.deleteUserById(id);
		
		if(deleted) {
			return "Deleted given user successfully!";
		}else {
			return "Not able to delete";
		}
		
		
	}
	
	
	
}
