package com.rafaelenrique.bookstoremanager.repository;

import com.rafaelenrique.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
