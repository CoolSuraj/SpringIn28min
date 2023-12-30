package com.suraj.learn.springmvc.BasicsTodo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.suraj.learn.springmvc.BasicsTodo.dto.Todo;
import com.suraj.learn.springmvc.BasicsTodo.service.TodoService;

@Controller
@SessionAttributes("name")/*this will ensure that this name attribute will stay till session completed
but the condition is that we have to place over all the classes using this else we cannot use the value*/
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todosByUsername = todoService.getTodosByUsername("surya");
		model.addAttribute("todos" , todosByUsername); //for collection we can use this
		return "todo/listAllTodos"; //as this is in seaprate folder we can mention like this 
		/**
		 * As name is session Attribute we do not need to write it again
		 */
	}

}
