package com.example.studentappbackend.service;

import com.example.studentappbackend.entity.Author;
import com.example.studentappbackend.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    // ekle- oluştur
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }
    //sil
    public  void deleteAuthor(Long id)
    {
        Author author= authorRepository.findById(id).orElseThrow(()-> new RuntimeException("silinecek veri bulunamadı"));
        authorRepository.delete(author);
    }
    //güncelle
    public Author updateAuthor(Long id, Author updateAuthor){
        Author existingAuthor = authorRepository.findById(id)
                .orElseThrow(()->new RuntimeException("güncellenecek veri bulunamadi"));
        existingAuthor.setAuthorAge(updateAuthor.getAuthorAge());
        existingAuthor.setAuthorEmail(updateAuthor.getAuthorEmail());
        existingAuthor.setAuthorName(updateAuthor.getAuthorName());
        return authorRepository.save(existingAuthor);

    }
    //listele
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
    //id göre getir
    public Author getAuthorById(Long id) {
        return authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Yazar bulunamadı"));
    }
}
