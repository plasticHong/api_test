package com.example.hh_rest_test.repository;

import com.example.hh_rest_test.somePack.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<Book,Long> {
}
