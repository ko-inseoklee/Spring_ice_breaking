package com.example.icebreaking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IcebreakingApplication {
	public static void main(String[] args) {

		SpringApplication.run(IcebreakingApplication.class, args);

		System.out.println("Success for opening server.");
	}
}
