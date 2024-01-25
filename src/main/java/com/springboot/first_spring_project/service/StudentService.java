package com.springboot.first_spring_project.service;

import java.util.List;
import java.util.Optional;

import com.springboot.first_spring_project.model.Student;

public interface StudentService {
	
	Student saveStudent(Student student);
	
	List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);

}
