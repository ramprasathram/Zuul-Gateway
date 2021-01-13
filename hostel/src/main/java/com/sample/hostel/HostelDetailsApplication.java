package com.sample.hostel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HostelDetailsApplication {

	@GetMapping("/getHostel")
	public String getHostelDetails(){
		System.out.println("BIT Hostel");
		return "Welcome to BIT Hostel";
	}

	public static void main(String[] args) {
		SpringApplication.run(HostelDetailsApplication.class, args);
	}

}
