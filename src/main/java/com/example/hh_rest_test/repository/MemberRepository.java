package com.example.hh_rest_test.repository;

import com.example.hh_rest_test.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MemberRepository extends JpaRepository<MemberEntity,Long> {

    Optional<MemberEntity> findByEmail(String email);

    @Query(value = "select id from members_HH where email = :email ")
    Optional<Long> findIdByEmail(String email);

}
