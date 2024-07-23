package com.glisten.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		System.out.println("Starting Backend Application...");
		SpringApplication.run(BackendApplication.class, args);
		System.out.println("Backend Application Started Successfully!");
	}

}
