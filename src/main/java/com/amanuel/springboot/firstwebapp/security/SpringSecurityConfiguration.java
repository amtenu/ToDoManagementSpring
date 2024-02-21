package com.amanuel.springboot.firstwebapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

@Configuration
public class SpringSecurityConfiguration {
	
//	InMemoryUserDetailsManager 
//	InMemoryUserDetailsManager(UserDetails...users)
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
	UserDetails userDetail=	User.withDefaultPasswordEncoder()
		.username("Amanuel")
	    .password("1234")
	    .roles("USER","ADMIN")
	    .build();
	
	return new InMemoryUserDetailsManager(userDetail);
	}

}
