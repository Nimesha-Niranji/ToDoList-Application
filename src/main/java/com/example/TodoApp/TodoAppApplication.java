package com.example.TodoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TodoAppApplication extends SpringBootServletInitializer {
//for WAR deployment
	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}
	// Launches the Spring Boot application
}
