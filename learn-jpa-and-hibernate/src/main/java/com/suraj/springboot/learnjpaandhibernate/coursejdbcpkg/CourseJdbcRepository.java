package com.suraj.springboot.learnjpaandhibernate.coursejdbcpkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.suraj.springboot.learnjpaandhibernate.dto.Course;

@Repository
public class CourseJdbcRepository {
	
	private static final String DELETE_FROM_COURSE_WHERE_ID = " delete from course where id=? ";
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	/**
	 * This is insert queries inside text block represented by 3 double quotes open-close
	 */
	private static String INSERT_QUERY = """
			insert into course(id,name,author) values(1,'Learn AWS','in28minutes');
			insert into course(id,name,author) values(2,'Learn SQL','Oracle');
			insert into course(id,name,author) values(3,'Learn Java','in28minutes');
			""";
	private static String INSERT_QUERY_PREPARED_STMT = """
			insert into course(id,name,author) values(?,?,?);
			
			""";
	public void insert() {
		/**
		 * this update can actually update,insert,delete
		 */
		springJdbcTemplate.update(INSERT_QUERY);  
	}
	
	/**
	 * 
	 * @param course
	 * we will use course bean to insert
	 */
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY_PREPARED_STMT,course.getId(),course.getName(),course.getAuthor()); 
	}
	
	public void deleteCourseById(int id) {
		springJdbcTemplate.update(DELETE_FROM_COURSE_WHERE_ID,id);
	}
}
