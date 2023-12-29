package com.suraj.jpalearn.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.jpalearn.app.dto.Course;

/**
 * In JPA there is no extra configurations just extend the JPARepository Repo with entity class and Primary key 
 * @author admin
 *
 */
public interface CourseRepository extends JpaRepository<Course, Long> {
	/**
	 * This method with this type of Naming culture need to explicitly
	 *  show so that we can able to find Course by Author
	 * @param author
	 * @return
	 */
	public List<Course> findByAuthor(String author);
}
