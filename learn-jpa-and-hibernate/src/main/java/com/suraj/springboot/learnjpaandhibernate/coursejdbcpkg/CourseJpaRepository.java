package com.suraj.springboot.learnjpaandhibernate.coursejdbcpkg;

import org.springframework.stereotype.Repository;

import com.suraj.springboot.learnjpaandhibernate.dto.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional  //used due to entity Manager
public class CourseJpaRepository {
	/**
	 * This is using JPA which makes code lesser than JDBC
	 */
	@PersistenceContext /*This is used instead of Autowired just to specify this for JPA Entity Manager*/
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
}
