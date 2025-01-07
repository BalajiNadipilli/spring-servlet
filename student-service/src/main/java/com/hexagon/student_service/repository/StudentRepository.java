package com.hexagon.student_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagon.student_service.model.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
