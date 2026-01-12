package com.example.studentappbackend.repository;
import com.example.studentappbackend.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BooksRepository extends JpaRepository<Books, Long> {

    // Yazara göre kitapları getir
    List<Books> findByAuthorId(Long authorId);
}
