package com.example.hh_rest_test.baseEntity;

import com.example.hh_rest_test.entity.member.MemberEntity;
import com.example.hh_rest_test.repository.MemberRepository;
import com.querydsl.jpa.impl.JPAQuery;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootTest
public class BaseEntityTest {


    @Autowired
    MemberRepository repository;

    @Test
    public void memberInsertTest() {

        MemberEntity member = new MemberEntity();
        member.setEmail("asd@naver.com");
        member.setName("모세");
        member.setLocation("아프리카");
        member.setUserid("meme");

        MemberEntity savedMember = repository.save(member);


        Assertions.assertThat(savedMember).isEqualTo(member);


    }

}
