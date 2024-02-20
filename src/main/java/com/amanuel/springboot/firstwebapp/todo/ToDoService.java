package com.amanuel.springboot.firstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
	private static  List<Todo> todos=new ArrayList<>();
	
	static {
		todos.add(new Todo(1,"Amanuel","AWS",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(2,"Amanuel","DevOps",
				LocalDate.now().plusYears(2),false));
		todos.add(new Todo(3,"Amanuel","Spring",
				LocalDate.now().plusYears(1),false));
	}
	
	public List<Todo> findByUserName(String username){
		return todos;
	}
	

}
