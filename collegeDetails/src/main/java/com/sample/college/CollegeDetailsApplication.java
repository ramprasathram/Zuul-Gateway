package com.sample.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CollegeDetailsApplication {


	@GetMapping("/getCollege")
	public String getCollegeDetails(){
		System.out.println("Welcome to BIT");
		return "Welcome to BIT";

	}

	public static void main(String[] args) {
		SpringApplication.run(CollegeDetailsApplication.class, args);
	}

}
