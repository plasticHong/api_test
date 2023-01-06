package com.example.hh_rest_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
public class HhRestTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(HhRestTestApplication.class, args);
    }

}
