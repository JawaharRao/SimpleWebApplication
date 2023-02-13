package com.example.SimWebAppfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimWebAppfinalApplication {

	public static void main(String[] args) {

		SpringApplication.run(SimWebAppfinalApplication.class, args);
		System.out.println("Simple Web Application Program - 1.1");
	}

	@GetMapping("/")
	public String index() {

		return "Greetings from Spring Boot!";
	}

}
