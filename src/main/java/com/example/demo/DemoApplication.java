package com.example.demo;

import configuration.SpringBootServletInitialize;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServletInitialize.class, args);
	}

}
