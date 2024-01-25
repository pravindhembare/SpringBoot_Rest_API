package com.springboot.first_spring_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.first_spring_project.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
