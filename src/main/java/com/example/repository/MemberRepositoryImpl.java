package com.example.repository;

import com.example.entity.member.QMemberEntity;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.Objects;
import java.util.Optional;

@Repository
public class MemberRepositoryImpl implements MemberCustomRepository{


    QMemberEntity member = new QMemberEntity("q");
    private final JPAQueryFactory jpaQueryFactory;
    public MemberRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public Optional<Long> findIdByEmail(String email){
        try {
            return jpaQueryFactory
                    .select(member.id)
                    .from(member)
                    .where(eqEmail(email),isUse())
                    .fetchOne().describeConstable();
        }catch (NullPointerException e){
            return Optional.empty();
        }
    }

    private BooleanExpression isUse() {
        return member.useYn.eq(true);
    }

    private BooleanExpression eqEmail(String email){
        if(Objects.isNull(email))return null;
        return member.email.eq(email);
    }

}
