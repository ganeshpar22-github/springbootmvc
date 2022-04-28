package com.springbootmvc.studentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootmvc.studentManagementSystem.Model.Student;
import com.springbootmvc.studentManagementSystem.Repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student s1 = new Student("Ganesh", "Parmar", "gp@gmail.com", "Dewas");
		studentRepository.save(s1);
		
		Student s2 = new Student("Gunjan", "Parmar", "gparmar@gmail.com", "Pune");
		studentRepository.save(s2);
		
		Student s3 = new Student("Yash", "Parmar", "y2j@gmail.com", "Indore");
		studentRepository.save(s3);
		
	}

}
