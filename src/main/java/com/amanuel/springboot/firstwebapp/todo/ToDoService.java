package com.amanuel.springboot.firstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
	private static  List<Todo> todos=new ArrayList<>();

	
	private static int  count=0;
	
	static {
		todos.add(new Todo(++count,"Amanuel","AWS",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++count,"Amanuel","DevOps",
				LocalDate.now().plusYears(2),false));
		todos.add(new Todo(++count,"Amanuel","Spring",
				LocalDate.now().plusYears(1),false));
	}
	
	public List<Todo> findByUserName(String username){
		return todos;
	}
	
	
	public void addTodo(String username,String description, LocalDate targetDate,boolean done){
		Todo todo=new Todo(++count,username,description,targetDate,done);
		todos.add(todo);
		
	}

}
