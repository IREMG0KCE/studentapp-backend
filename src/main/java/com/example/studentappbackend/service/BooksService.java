package com.example.studentappbackend.service;

import com.example.studentappbackend.entity.Author;
import com.example.studentappbackend.entity.Books;
import com.example.studentappbackend.repository.AuthorRepository;
import com.example.studentappbackend.repository.BooksRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    private final BooksRepository booksRepository;
    private final AuthorRepository authorRepository;

    public BooksService(BooksRepository booksRepository, AuthorRepository authorRepository) {
        this.booksRepository = booksRepository;
        this.authorRepository = authorRepository;
    }

    // Yazara kitap ekle
    public Books createBook(Long authorId, Books book) {
        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new RuntimeException("Yazar bulunamadı"));

        book.setAuthor(author);//Foreign key burada bağlanıyor
        return booksRepository.save(book);
    }

    public List<Books> getBooksByAuthor(Long authorId) {
        return booksRepository.findByAuthorId(authorId);
    }

    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }
}
