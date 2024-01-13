package com.suraj.learn.springmvc.BasicsTodo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.suraj.learn.springmvc.BasicsTodo.dto.Todo;

import jakarta.validation.Valid;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	/**
	 * For now created Static things later will use DB
	 */
	static {
		todos.add(new Todo(1, "in28min", "Learn Spring",
				LocalDate.now().plusMonths(13), false));
		todos.add(new Todo(2, "in28min", "Learn AWS",
				LocalDate.now().plusMonths(14), false));
		todos.add(new Todo(3, "surya", "Learn Data Science",
				LocalDate.now().plusMonths(16), false));
		todos.add(new Todo(4, "surya", "Learn Fishing",
				LocalDate.now().minusMonths(20), true));
	}

	public  List<Todo> getTodosByUsername(String username) {
		/**
		 * We should compare each and every Todo object and find the required Todos
		 */
		System.out.println(todos);
		return todos.stream().filter(e-> e.getUsername().equalsIgnoreCase(username)).collect(Collectors.toList());
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	/**
	 * Using Stream to collect the elements which is not equals to given ID
	 * @param id
	 */
	public void deleteTodo(long id) {
		//todos = todos.stream().filter(e->e.getId() != id).collect(Collectors.toList());
		/**
		 * Easy Implementation
		 */
		todos.removeIf(todo->todo.getId() == id);
	}
	
	public Todo getTodoById(long id) {
		Todo todo = todos.stream().filter(todo1->todo1.getId() == id).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteTodo(todo.getId());
		addTodo(todo);
		
	}
	
	

	
	

}
