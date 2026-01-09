package com.example.studentappbackend.repository;

import com.example.studentappbackend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Student, Long> {
}
