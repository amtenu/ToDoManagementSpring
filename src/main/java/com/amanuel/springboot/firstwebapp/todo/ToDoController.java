package com.amanuel.springboot.firstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoController {
	
	
	
	
	public ToDoController(ToDoService todoService) {
		super();
		this.todoService = todoService;
	}

	private ToDoService todoService;
	

	@RequestMapping("list-todos")
	public String listAllToDos(ModelMap model) {
	List<Todo> todos=	todoService.findByUserName("amanuel");
	model.addAttribute("todos",todos);
		return "listToDos";
	}
	
	

}
