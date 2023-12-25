package com.suraj.springboot.learnjpaandhibernate.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;  
/**
 * We will now check how to use JPA for this we need to use some annotations like Entity,Table,Column,etc
 * @author admin
 *
 */
@Entity
public class Course {
	/**
	 * As the name in here and Table exactly same we are not using like below else use like 
	 * Eg:
	 * @Column(name="name")
		private String name;
	 */
	@Id
	private long id;
	@Column
	private String name;
	@Column
	private String author;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", id=" + id + ", author=" + author
				+ "]";
	}
	public Course(String name, long id, String author) {
		this.name = name;
		this.id = id;
		this.author = author;
	}
	public Course() {

	}

}
