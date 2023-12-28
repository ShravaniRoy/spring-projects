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
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAOImple studentDAO) {

		// create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Sita", "Ram", "sita@ram.com");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
}
