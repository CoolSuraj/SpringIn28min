package com.suraj.restapi.project.restfulwebservices.dto;

public class PersonV2 {
	
	public Name name;

	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public PersonV2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PersonV2 [name=" + name + "]";
	}
	
	
	
	
}
