package com.example.controller;

import com.example.test_entity.Book;
import com.example.repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestRepo repo;

    @RequestMapping(method = RequestMethod.GET, value = "api/books")
    public ResponseEntity<?> getBook() {

        Book byId = repo.findById(1L).get();

        return new ResponseEntity<>(byId, HttpStatus.OK);
    }

}
