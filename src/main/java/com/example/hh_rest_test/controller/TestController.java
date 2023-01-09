package com.example.hh_rest_test.controller;

import com.example.hh_rest_test.somePack.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.hh_rest_test.repository.TestRepo;

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
