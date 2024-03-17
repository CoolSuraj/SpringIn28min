package com.suraj.learn.springmvc.BasicsTodo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.learn.springmvc.BasicsTodo.dto.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>  {
	
	public List<Todo> findByUsername(String username);
	
}
