package com.springbootmvc.studentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootmvc.studentManagementSystem.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
