package com.springboot.first_spring_project.service.impl;

import org.springframework.stereotype.Service;

import com.springboot.first_spring_project.Repository.StudentRepository;
import com.springboot.first_spring_project.model.Student;
import com.springboot.first_spring_project.service.StudentService;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	
	 @Override
	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

	    @Override
	    public Optional<Student> getStudentById(Long id) {
	        return studentRepository.findById(id);
	    }

	    @Override
	    public Student updateStudent(Long id, Student updatedStudent) {
	        Optional<Student> existingStudentOptional = studentRepository.findById(id);
	        if (existingStudentOptional.isPresent()) {
	            Student existingStudent = existingStudentOptional.get();
	            existingStudent.setSname(updatedStudent.getSname());
	            existingStudent.setStd(updatedStudent.getStd());
	            existingStudent.setDiv(updatedStudent.getDiv());	           
	            return studentRepository.save(existingStudent);
	        }
	        return null;
	    }

	    @Override
	    public void deleteStudent(Long id) {
	        studentRepository.deleteById(id);
	    }

}
