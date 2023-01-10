package com.example.repository;

import com.example.entity.member.MemberEntity;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MemberCustomRepository {

    Optional<Long> findIdByEmail(@Param(value = "email") String email);

}
