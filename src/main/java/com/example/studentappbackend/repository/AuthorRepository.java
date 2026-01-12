package com.example.studentappbackend.repository;
import com.example.studentappbackend.entity.Author;//entitiy import ediyorum
import org.springframework.data.jpa.repository.JpaRepository;//Spring’in hazır veritabanı işlemleri yapan arayüzünü (interface) içeri alır.
public interface AuthorRepository extends JpaRepository<Author, Long> {//burdaki satırdaki Long, Author entity’sinin primary key (id) tipini ifade eder.
//JpaRepository den dolayı crud otomatik gelir.


}
