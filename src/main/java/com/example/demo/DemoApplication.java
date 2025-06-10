package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Starting the Spring Boot application...");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Spring Boot application started successfully!");
    }
}
