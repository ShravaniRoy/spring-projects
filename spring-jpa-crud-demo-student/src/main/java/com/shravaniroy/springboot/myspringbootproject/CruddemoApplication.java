package com.shravaniroy.springboot.myspringbootproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String args[]){ //executed after the beans have been loaded.
		return runner -> {
			System.out.println("Running from command line");
		}; //Java lambda expression
	}
}
