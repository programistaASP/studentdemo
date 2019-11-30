package com.j28.spring.studentdemo.repository;

import com.j28.spring.studentdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
//    List<Student> findAllByLastName(String lastName);
}
