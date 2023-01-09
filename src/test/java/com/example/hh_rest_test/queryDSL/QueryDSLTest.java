package com.example.hh_rest_test.queryDSL;


import com.example.hh_rest_test.somePack.MemberEntity;
import com.example.hh_rest_test.somePack.QMemberEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@SpringBootTest
public class QueryDSLTest {
    @PersistenceContext
    private EntityManager dslManager;


    @Test
    public void queryDSLTest() {

        EntityManager entityManager = dslManager.getEntityManagerFactory().createEntityManager();
        QMemberEntity qMemberEntity = new QMemberEntity("q");


        JPAQueryFactory query = new JPAQueryFactory(entityManager);

        List<MemberEntity> members = query
                .select(qMemberEntity)
                .from(qMemberEntity)
                .where(qMemberEntity.email.containsIgnoreCase("hh"))
                .fetch();

        Assertions.assertThat(members.size()).isEqualTo(3);

    }


}
