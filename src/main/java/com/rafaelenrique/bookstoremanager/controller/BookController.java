package com.rafaelenrique.bookstoremanager.controller;

import com.rafaelenrique.bookstoremanager.dto.BookDTO;
import com.rafaelenrique.bookstoremanager.dto.MessageResponseDTO;
import com.rafaelenrique.bookstoremanager.entity.Book;
import com.rafaelenrique.bookstoremanager.repository.BookRepository;
import com.rafaelenrique.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.lang.reflect.Constructor;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired //realiza injeção de dependência
    public BookController(BookService bookService) {

        this.bookService = bookService;
    }

    @PostMapping    //Marcando como tipo de operação Post
    public MessageResponseDTO create(@RequestBody Book book){
        return bookService.create(book);
    }

}
