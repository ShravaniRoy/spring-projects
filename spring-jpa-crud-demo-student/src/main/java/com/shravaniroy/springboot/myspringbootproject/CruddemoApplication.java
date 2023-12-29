package com.shravaniroy.springboot.myspringbootproject;

import com.shravaniroy.springboot.myspringbootproject.dao.StudentDAOImple;
import com.shravaniroy.springboot.myspringbootproject.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAOImple studentDAO) {

		return runner -> {
//			createMultipleStudent(studentDAO);
			int id = 1;
			readStudent(studentDAO, id);
//			queryForStudents(studentDAO);
//			queryByLastname(studentDAO);
			updateQueryStudent(studentDAO);
		};
	}

	private void updateQueryStudent(StudentDAOImple studentDAO) {
		int tempId = 1;

		//get a student by id
		System.out.println("getting a student by id = tempId as 1");
		Student tempStudent = readStudent(studentDAO, tempId);

		System.out.println("The current first name of the student is "+ tempStudent.getFirstName());
		//use update method to change the student first name
		tempStudent.setFirstName("Siya");
		studentDAO.updateStudent(tempStudent);

		//display updated student
		System.out.println("Updated studnet "+ tempStudent);

	}

	private void queryByLastname(StudentDAOImple studentDAO) {
		//get a list of students whose lastname is Roy
		List<Student> theStudentsGotByParameter = studentDAO.findByLastname("Roy");

		//display the list of students
		for (Student tempStudent : theStudentsGotByParameter){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAOImple studentDAO) {
		//get a list of students
		List<Student> theStudentsRetrievedFromDBTable = studentDAO.listAll();

		//display the list of students
		for (Student tempStudent : theStudentsRetrievedFromDBTable){
			System.out.println(tempStudent);
		}
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

	private Student readStudent(StudentDAOImple studentDAO, int tempid) {
		//saving these student rows into DB using DAO
		Student result = studentDAO.readById(tempid);

//		System.out.println(result);
		return result;
	}



}
