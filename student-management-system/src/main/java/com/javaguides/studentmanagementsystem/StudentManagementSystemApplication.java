package com.javaguides.studentmanagementsystem;

import com.javaguides.studentmanagementsystem.entity.Student;
import com.javaguides.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * The type Student management system application.
 */
@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {


	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);

		try {
			Connection obj = DriverManager.getConnection("jdbc:mysql://localhost:3309/sms?useSSl=false&serverTimezone=UTC&useLegacyDatetimeCode=false", "root", "root");
           System.out.println(obj);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
 @Autowired
 private StudentRepository studentRepository;


	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Dior","Chamberlin","chamberlindior@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Ciara","Travis","ciaratravis@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("luna","Travis","chamberlindior@gmail.com");
		studentRepository.save(student3);
	}
}
