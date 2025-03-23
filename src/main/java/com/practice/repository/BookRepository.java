package com.practice.repository;


/*
 * @Created 3/23/25
 * @Project springboot-graphql
 * @User Kumar Padigeri
 */

import com.practice.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
