package com.rocktech.studentservicejpa.service;

import com.rocktech.studentservicejpa.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
