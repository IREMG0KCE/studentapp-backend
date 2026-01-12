package com.example.studentappbackend.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Authors")


public class Author {
    @Id
    //ıd otomatik oluşturulcak

    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private Long id;
    public String authorName;
    public String authorEmail;
    public int authorAge;
    // Bir yazarın birden fazla kitabı olabilir
    @OneToMany(mappedBy = "author")
    @JsonIgnore
    public List<Books> books;

}
