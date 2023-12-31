package com.suraj.learn.springmvc.BasicsTodo.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.suraj.learn.springmvc.BasicsTodo.dto.Todo;
import com.suraj.learn.springmvc.BasicsTodo.service.TodoService;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")/*this will ensure that this name attribute will stay till session completed
but the condition is that we have to place over all the classes using this else we cannot use the value*/
public class TodoController {
	/**
	 * In this entire controller we are assuming author to be surya and hence will hardocde
	 */
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
	
	@RequestMapping(value= "add-todo", method=RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String username = (String)model.get("name");
		Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "todo/todo";
	}
	/**
	 * As there were no validations we had hence we change mapping for now 
	 * @param description
	 * @param model
	 * @return
	 */
	@RequestMapping(value= "add-todo-basic", method=RequestMethod.POST)
	public String addNewTodo(@RequestParam String description,ModelMap model) {
//method-1
		//		List<Todo> todosByUsername = todoService.getTodosByUsername("surya");
//		todosByUsername.add(new Todo((long)(todosByUsername.size()-1) , "surya",description,
//				LocalDate.now().plusMonths(12), false));
//		model.addAttribute("todos" , todosByUsername);
//		return "todo/listAllTodos";
	
		//method 2
		List<Todo> todosByUsername = todoService.getTodosByUsername("surya");
		todoService.addTodo(new Todo((long)(todosByUsername.size()+1) , "surya",description,
				LocalDate.now().plusMonths(12), false));
		//This redirect will actually call http://localhost:8080/list-todos 
		return "redirect:list-todos";
		
	}
	
	
	/**
	 * Here We will try to implement validations for that we will try to add logic in Entity 
	 * and try to bind Todo Entity Directly instead of all variables individually
	 * @Valid -- will bind validation to that entity 
	 * @param model
	 * @param todo
	 * @return
	 */
	@RequestMapping(value= "add-todo", method=RequestMethod.POST)
	public String addNewTodo( ModelMap model,@Valid Todo todo,BindingResult result ) {
		/**
		 * as Validation will give very bad o/p when validation fails to avoid
		 * That we use BindingResult so if Error is there we will go to some Good Page
		 * In this case the same page
		 */
		if(result.hasErrors()) {
			return "todo/todo";
		}
		
		List<Todo> todosByUsername = todoService.getTodosByUsername("surya");
		todoService.addTodo(new Todo((long)(todosByUsername.size()+1) , "surya",todo.getDescription(),
				LocalDate.now().plusMonths(12), false));
		//This redirect will actually call http://localhost:8080/list-todos 
		return "redirect:list-todos";
		
	}
}
