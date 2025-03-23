package com.practice.mapper;


/*
 * @Created 3/23/25
 * @Project springboot-graphql
 * @User Kumar Padigeri
 */


import com.practice.domain.Book;
import com.test.model.BookAO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {


    List<BookAO> BookEntityToBookDTO(List<Book> book);

    BookAO BookEntityToBookDTO(Book book);


    Book BookDTOToBookEntity(BookAO book);
}
