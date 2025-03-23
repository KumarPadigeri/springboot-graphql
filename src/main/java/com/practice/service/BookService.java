package com.practice.service;


/*
 * @Created 3/23/25
 * @Project springboot-graphql
 * @User Kumar Padigeri
 */

import com.practice.domain.Book;
import com.practice.mapper.BookMapper;
import com.practice.repository.BookRepository;
import com.test.model.BookAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public List<BookAO> fetchAllBooks() {
        return bookMapper.BookEntityToBookDTO(bookRepository.findAll());
    }

    public BookAO findByBookId(int id) {
        Optional<Book> byId = bookRepository.findById(id);
        if (byId.isPresent()) {
            return bookMapper.BookEntityToBookDTO(byId.get());
        } else {
            throw new RuntimeException("Book Not found!!");
        }

    }

    public BookAO updateBookPrice(int id, int updatedPrice) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) {
            book.get().setPrice(book.get().getPrice() + updatedPrice);
            return bookMapper.BookEntityToBookDTO((bookRepository.save(book.get())));
        } else {
            throw new RuntimeException("Book Not found!!");

        }


    }

    public BookAO deleteBook(int id) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) {
            bookRepository.deleteById(id);
            return bookMapper.BookEntityToBookDTO(book.get());
        } else {
            throw new RuntimeException("Book Not found!!");
        }
    }

    public BookAO insertBook(BookAO book) {
        return bookMapper.BookEntityToBookDTO(bookRepository.save(bookMapper.BookDTOToBookEntity(book)));
    }

}
