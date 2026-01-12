package com.example.studentappbackend.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Books")
public class Books {
    @Id
    //ıd otomatik oluşturulcak
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String booksName;
    public int booksPage;
    public String booksType;
    // Bir kitabın bir yazarı olur
    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonIgnore

    public Author author;
}
