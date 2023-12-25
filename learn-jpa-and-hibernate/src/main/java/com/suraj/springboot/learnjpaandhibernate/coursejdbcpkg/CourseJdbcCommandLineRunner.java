package com.suraj.springboot.learnjpaandhibernate.coursejdbcpkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.suraj.springboot.learnjpaandhibernate.dto.Course;

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
		/**
		 * insert using the query
		 */
		repo.insert();
		/**
		 * Insert using dto's and SpringJdbcTemplate
		 */
		repo.insert(new Course("Learn Python", 4, "AutomateBoringStuff"));
		repo.deleteCourseById(2);//it will delete course with id 2 every time this runs!!
		
		System.out.println(repo.findById(3));
	}

}
