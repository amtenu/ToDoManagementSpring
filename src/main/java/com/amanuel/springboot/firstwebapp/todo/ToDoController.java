package com.amanuel.springboot.firstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		List<Todo> todos = todoService.findByUserName("amanuel");
		model.addAttribute("todos", todos);
		return "listToDos";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String username = (String) model.get("name");
		Todo todo=new Todo(0,username,"",LocalDate.now().plusYears(1),false);//default values
		model.put("todo", todo);

		return "todo";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addNewToDos(ModelMap model,Todo todo) {
		String username = (String) model.get("name");
		todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}

}
