package com.suraj.restapi.project.restfulwebservices.helloworldcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.restapi.project.restfulwebservices.dto.Name;
import com.suraj.restapi.project.restfulwebservices.dto.PersonV1;
import com.suraj.restapi.project.restfulwebservices.dto.PersonV2;

@RestController
public class PersonVersioningController {
	
	/**
	 * URL Versioning : in this we use v1,v2 in URL
	 */
	
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionPerson() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionPerson() {
		return new PersonV2(new Name("Bob","Charlie"));
	}
	/**
	 * Versioning based on Request Params
	 * like localhost:8080/person?version=2
	 * @return
	 */
	@GetMapping(path="/person", params="version=2")
	public PersonV2 getVersionPersonByReqParam2() {
		return new PersonV2(new Name("Bob","Charlie"));
	}
	
	@GetMapping(path="/person", params="version=1")
	public PersonV1 getVersionPersonByReqParam1() {
		return new PersonV1("Bob Charlie");
	}
	
	/**
	 * Versioning based on headers
	 * like localhost:8080/personH
	 * add headers value as shown
	 * X-API-VERSION=2
	 * @return
	 */
	
	@GetMapping(path="/personH", headers="X-API-VERSION=2")
	public PersonV2 getVersionPersonByHeaders2() {
		return new PersonV2(new Name("Bob","Charlie"));
	}
	
	@GetMapping(path="/personH", headers="X-API-VERSION=1")
	public PersonV1 getVersionPersonByHeaders1() {
		return new PersonV1("Bob Charlie");
	}
	
	
	/**
	 * Versioning based on media type i.e Content Negotians
	 * like localhost:8080/person/accept 
	 * add header like 
	 * Accept = "application/vnd.company.app-v1+json"
	 * @return
	 */
	
	@GetMapping(path="/person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getVersionPersonByMedia2() {
		return new PersonV2(new Name("Bob","Charlie"));
	}
	
	@GetMapping(path="/person/accept", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getVersionPersonByMedia1() {
		return new PersonV1("Bob Charlie");
	}
	
}
