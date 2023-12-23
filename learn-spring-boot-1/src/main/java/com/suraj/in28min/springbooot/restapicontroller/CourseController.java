package com.suraj.in28min.springbooot.restapicontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.in28min.springbooot.dto.Course;

@RestController  //This is special annotation to tell that this is REST
public class CourseController {
	
	@RequestMapping("/courses")  //To map 
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(new Course("Learn AWS", 1, "in28minutes"),
				new Course("Learn Devops", 2, "JavaTechie"));
	}

}
