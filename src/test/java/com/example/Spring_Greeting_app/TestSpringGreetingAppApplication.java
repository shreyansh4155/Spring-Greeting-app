package com.example.Spring_Greeting_app;

import org.springframework.boot.SpringApplication;

public class TestSpringGreetingAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringGreetingAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
