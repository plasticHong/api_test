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
        member.setEmail("dddd@naver.com");
        member.setName("모세");
        member.setLocation("서울");
        member.setLocationDetail("동작구");
        member.setUserid("meme");

        MemberEntity savedMember = repository.save(member);


        Assertions.assertThat(savedMember).isEqualTo(member);
        Assertions.assertThat(savedMember.getCreateTime()).isEqualTo(member.getCreateTime());
        Assertions.assertThat(savedMember.getState()).isEqualTo(1);

    }

}
