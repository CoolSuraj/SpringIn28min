package com.suraj.learn.springmvc.BasicsTodo.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
//Static List of Todo's 


//JPA allow us to map Bean-> Database by using few annotations
//When you use this annotation Spring boot directly creates table if it is not present(at least h2)
@Entity  // you can customize name by addiing like this (name="DailyTasks")
public class Todo {
	
	@Id
	@GeneratedValue
	private long id;
	//@Column //this also we can use but if you need no customization is needed
	private String username;
	/**
	 * This is validation at Server for not adding less than 3 charachters
	 */
	@Size(min=3,message = "At least 3 char to be added") 
	private String description;
	private LocalDate targetDate;
	private boolean done;

	public Todo(long id, String username, String description,
			LocalDate targetDate, boolean done) {

		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description="
				+ description + ", targetDate=" + targetDate + ", done=" + done
				+ "]";
	}

}
