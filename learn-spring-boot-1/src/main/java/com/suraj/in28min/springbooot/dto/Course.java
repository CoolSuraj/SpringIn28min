package com.suraj.in28min.springbooot.dto;

public class Course {
	
	private String name;
	private long id;
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
