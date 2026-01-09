package com.example.studentappbackend.service;

import com.example.studentappbackend.entity.Student;
import com.example.studentappbackend.repository.TestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final TestRepository studentRepository;

    // Constructor injection (Spring otomatik verir)
    public StudentService(TestRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Tüm öğrencileri getir
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Yeni öğrenci ekle
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    // ID ile öğrenci bul
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Öğrenci sil
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
