package com.example.studentappbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String email;

    // JPA için zorunlu boş constructor
    public Student() {
    }

    // Manuel constructor
    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter - Setter'lar

    public Long getId() {
        return id;
    }

    // id için setter genelde yazılmaz (DB yönetir)
    // ama öğrenme aşamasında sorun değil

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
