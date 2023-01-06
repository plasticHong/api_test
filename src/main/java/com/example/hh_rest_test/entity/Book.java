package com.example.hh_rest_test.entity;

import jakarta.persistence.*;
import lombok.Data;

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
