package com.suraj.jpalearn.app.runproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.suraj.jpalearn.app.dto.Course;
import com.suraj.jpalearn.app.repository.CourseRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	/**
	 * This is autowired in this to use Db Method
	 */
	@Autowired
	CourseRepository repo;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Course(1,"Algebra","Bhaskaryacharya"));
		repo.save(new Course(2,"Spring-data-jpa","in28min"));
		repo.save(new Course(3,"Spring","in28min"));
		repo.save(new Course(4,"Learn AWS","in28min"));
		
		repo.deleteById(3l);
		
		System.out.println(repo.findById(4l));
		System.out.println();
		System.out.println(repo.findByAuthor("in28min"));

	}

}
