package com.example.hh_rest_test;

import com.example.hh_rest_test.entity.member.MemberEntity;
import com.example.hh_rest_test.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class HhRestTestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    MemberRepository repository;

    @Test
    public void checkTest() {

        Optional<MemberEntity> byEmail = repository.findByEmail("hh.son@khsystems.co.kr");

        boolean present = byEmail.isPresent();

        Assertions.assertThat(present).isEqualTo(true);
    }

}
