package com.suraj.springboot.learnjpaandhibernate.coursejdbcpkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJdbcRepository repo; 
	/**
	 * When we implement this interface we actually can run anything at startup of spring boot application
	 * So We are running custom insert queries so that we can have some h2 data predefined
	 */
	@Override
	public void run(String... args) throws Exception {
		
		repo.insert();
	}

}
