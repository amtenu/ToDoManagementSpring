package com.amanuel.springboot.firstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class ToDoService {

	private static List<Todo> todos = new ArrayList<>();

	private static int count = 0;

	static {
		todos.add(new Todo(++count, "Amanuel", "AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++count, "Amanuel", "DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++count, "Amanuel", "Spring", LocalDate.now().plusYears(1), false));
	}

	public List<Todo> findByUserName(String username) {
		return todos;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++count, username, description, targetDate, done);
		todos.add(todo);

	}

	public void deleteByID(int id) {

		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(int id) {

		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
	
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		
		deleteByID(todo.getId());
		todos.add(todo);
		
	}

	

}
