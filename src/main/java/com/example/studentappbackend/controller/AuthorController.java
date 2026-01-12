package com.example.studentappbackend.controller;

import com.example.studentappbackend.entity.Author;
import com.example.studentappbackend.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
//deneme
    // POST /authors -> yazar ekle
    @PostMapping("/create")
    public Author createAuthor(@RequestBody Author author) {
        return authorService.createAuthor(author);
    }

    // GET /authors -> tüm yazarları getir.
    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }
    // Basit test endpoint
    @GetMapping("/author")
    public String author() {
        return "Backend çalışıyor kolay gelsinn 🚀";
    }

    // GET /authors/{id} -> id'ye göre yazar
    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }
}
