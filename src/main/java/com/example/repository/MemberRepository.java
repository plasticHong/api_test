package com.example.repository;

import com.example.entity.member.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MemberRepository extends JpaRepository<MemberEntity,Long> {

    Optional<MemberEntity> findByEmail(String email);

//    @Query(value = "select id from MemberEntity where email = :email and useYn = true ")
    Optional<Long> findIdByEmail(@Param(value = "email") String email);




}
