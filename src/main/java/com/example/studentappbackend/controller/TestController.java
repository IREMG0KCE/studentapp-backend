package com.example.studentappbackend.controller;

import com.example.studentappbackend.entity.Student;
import com.example.studentappbackend.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test") // isteğe bağlı, endpointleri /test altında topluyoruz
public class TestController {

    private final StudentService studentService;

    // Constructor injection
    public TestController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Basit test endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Backend çalışıyor kolay gelsin 🚀";
    }

    // Tüm öğrencileri listele
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // ID ile öğrenci getir
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    // Yeni öğrenci ekle
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // Öğrenci sil
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
