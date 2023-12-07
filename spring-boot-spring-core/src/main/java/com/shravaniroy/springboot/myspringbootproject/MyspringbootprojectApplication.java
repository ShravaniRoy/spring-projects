package com.shravaniroy.springboot.myspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(
		scanBasePackages = {
				"com.shravaniroy.springboot.myspringbootproject",
				"com.shravaniroy.springboot.util"
		}
)
*/
@SpringBootApplication
public class MyspringbootprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringbootprojectApplication.class, args);
	}

}
