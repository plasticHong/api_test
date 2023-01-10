package com.example;

import com.example.entity.member.MemberEntity;
import com.example.repository.MemberRepository;
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
