package com.suraj.restapi.project.restfulwebservices.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
/**
 * @JsonIgnore and @JsonIgnoreProperties is something called as static filtering 
 * @author Suraj
 *
 */
@JsonIgnoreProperties("userName") //this will also ignore in json the mentioned fields
@JsonFilter("BirthDateFilter")//this is part of dynamic filtering for users/{id}
public class User {

	private Integer id;
	@Size(min=2,message="Name Should Have at least 2 charchters")	
	@JsonProperty(value="Name")  //this annotation will change how it looks in our API
	private String name;
	@Past(message="BirthDate Should not be greater than present date") //this will ensure that birthdate should not be above present
	private LocalDate birthDate;
	@JsonIgnore  //this will ignore password in Json 
	private String password;
	
	private String userName;
	
	

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate
				+ "]";
	}
	public User(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
