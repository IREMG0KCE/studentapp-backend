package com.example.studentappbackend.controller;

import com.example.studentappbackend.entity.Books;
import com.example.studentappbackend.service.BooksService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    // POST /books/{authorId} -> yazara kitap ekle
    @PostMapping("/{authorId}")
    public Books createBook(
            @PathVariable Long authorId,
            @RequestBody Books book
    ) {
        return booksService.createBook(authorId, book);
    }

    // GET /books -> tüm kitaplar
    @GetMapping
    public List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    // GET /books/author/{authorId} -> yazara göre kitaplar
    @GetMapping("/author/{authorId}")
    public List<Books> getBooksByAuthor(@PathVariable Long authorId) {
        return booksService.getBooksByAuthor(authorId);
    }
}
