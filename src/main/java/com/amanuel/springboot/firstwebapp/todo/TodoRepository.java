package com.amanuel.springboot.firstwebapp.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Integer>{
	

}
