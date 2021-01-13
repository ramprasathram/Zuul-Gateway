package com.sample.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulProxy
public class StudentGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentGatewayApplication.class, args);
	}

}
