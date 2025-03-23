package com.practice.domain;


/*
 * @Created 3/23/25
 * @Project springboot-graphql
 * @User Kumar Padigeri
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity(name = "BOOK")
@NoArgsConstructor
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String authorName;
    private String authorBio;
    private String publishedDate;
    private String isbn;
    private String genre;
    private String language;
    private Integer pageCount;
    private String publisher;
    private Integer price;
}
