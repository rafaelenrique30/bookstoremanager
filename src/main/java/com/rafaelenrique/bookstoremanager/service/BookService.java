package com.rafaelenrique.bookstoremanager.service;

import com.rafaelenrique.bookstoremanager.dto.BookDTO;
import com.rafaelenrique.bookstoremanager.dto.MessageResponseDTO;
import com.rafaelenrique.bookstoremanager.entity.Book;
import com.rafaelenrique.bookstoremanager.mapper.BookMapper;
import com.rafaelenrique.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {
    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book){

        Book bookToSave = bookMapper.toModel(book);

        Book savedBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID "+ savedBook.getId())
                .build();
    }
}
