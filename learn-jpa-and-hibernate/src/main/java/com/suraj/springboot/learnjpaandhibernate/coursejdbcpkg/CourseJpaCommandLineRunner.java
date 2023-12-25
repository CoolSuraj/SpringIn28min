package com.suraj.springboot.learnjpaandhibernate.coursejdbcpkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.suraj.springboot.learnjpaandhibernate.dto.Course;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJpaRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.insert(new Course("Learning CSE", 8, "Abhishek") );
		Course course = repo.findById(8);
		System.out.println(course);
	} 
	

	
	

}
