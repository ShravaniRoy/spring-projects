package com.shravaniroy.springboot.myspringbootproject;

import com.shravaniroy.springboot.myspringbootproject.dao.StudentDAOImple;
import com.shravaniroy.springboot.myspringbootproject.entity.Student;
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
	public CommandLineRunner commandLineRunner(StudentDAOImple studentDAO) {

		return runner -> {
			createMultipleStudent(studentDAO);
		};
	}

	private void createMultipleStudent(StudentDAOImple studentDAO) {
		Student tempStudent1 = new Student("Rahul", "Roy", "rahulroy@ram.com");
		Student tempStudent2 = new Student("Shravani", "Roy", "shravaniroy@sitaram.com");
		Student tempStudent3 = new Student("Rihansh", "Karthik", "rk@sitaram.com");

		System.out.println("saving multiple student objects in DB");
		//saving these student rows into DB using DAO
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);


	}

}
