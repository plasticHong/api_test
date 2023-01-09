package com.example.hh_rest_test.somePack;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String writer;


    public Book(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    public Book() {

    }

    public Book(long id) {
        this.id = id;
    }
}
