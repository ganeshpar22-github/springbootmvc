package com.springbootmvc.studentManagementSystem.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootmvc.studentManagementSystem.Model.Student;
import com.springbootmvc.studentManagementSystem.Repository.StudentRepository;
import com.springbootmvc.studentManagementSystem.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

}
