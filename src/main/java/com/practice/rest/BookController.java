package com.practice.rest;


/*
 * @Created 3/23/25
 * @Project springboot-graphql
 * @User Kumar Padigeri
 */

import com.practice.service.BookService;
import com.test.model.BookAO;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookController {

    private final BookService service;

    @QueryMapping
    public List<BookAO> fetchAllBooks() {
        return service.fetchAllBooks();
    }

    @QueryMapping
    public BookAO findByBookId(@Argument int id) {
        return service.findByBookId(id);
    }

    @MutationMapping
    public BookAO updateBookPrice(@Argument int id, @Argument int updatedPrice) {
        return service.updateBookPrice(id, updatedPrice);
    }

    @MutationMapping
    public BookAO deleteBook(@Argument int id) {
        return service.deleteBook(id);
    }

    @MutationMapping
    public BookAO insertBook(@Argument BookAO book) {
        return service.insertBook(book);
    }


}
