package com.example.hh_rest_test.queryDSL;


import com.example.hh_rest_test.entity.member.MemberEntity;
import com.example.hh_rest_test.entity.member.QMemberEntity;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@SpringBootTest
public class QueryDSLTest {
    @PersistenceContext
    private EntityManager dslManager;

    QMemberEntity qMemberEntity = new QMemberEntity("q");
    @Test
    public void queryDSLTest() {


        EntityManager entityManager = dslManager.getEntityManagerFactory().createEntityManager();


        JPAQueryFactory query = new JPAQueryFactory(entityManager);

        List<MemberEntity> members = query
                .select(qMemberEntity)
                .from(qMemberEntity)
                .where(eqEmail("na"))
                .fetch();

        Assertions.assertThat(members.size()).isGreaterThan(3);

    }

    private BooleanExpression eqEmail(String email) {
        if(StringUtils.isBlank(email))return null;
        return qMemberEntity.email.contains(email);
    }




}
