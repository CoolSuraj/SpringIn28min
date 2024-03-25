package com.suraj.restapi.project.restfulwebservices.dto;

public class PersonV1 {
	
	String fullName;

	public PersonV1(String fullName) {
		super();
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "PersonV1 [fullName=" + fullName + "]";
	}
	
}
