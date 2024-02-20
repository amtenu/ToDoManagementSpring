package com.amanuel.springboot.firstwebapp.todo;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate (String name, String password) {
		
		boolean isValidName =name.equalsIgnoreCase("amanuel");
		boolean isValidPassword =password.equalsIgnoreCase("1234");
		
		return isValidName && isValidPassword;
	}
	
}
