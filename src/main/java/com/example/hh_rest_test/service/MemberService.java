package com.example.hh_rest_test.service;


import com.example.hh_rest_test.dto.MemberDTO;
import com.example.hh_rest_test.entity.MemberEntity;
import com.example.hh_rest_test.repository.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;
import java.util.Optional;

@AllArgsConstructor
@Service
public class MemberService {
    MemberRepository repo;
    ModelMapper modelMapper;

    @Transactional
    public com.example.hh_rest_test.dto.MemberDTO memberJoin(com.example.hh_rest_test.dto.MemberDTO memberDTO) {

        MemberEntity save = repo.save(modelMapper.map(memberDTO, MemberEntity.class));

        return modelMapper.map(save, com.example.hh_rest_test.dto.MemberDTO.class);

    }


    @Transactional
    public MemberDTO updateMember(@NonNull MemberDTO newMemberInfoDTO) {

        MemberEntity memberEntity = repo.findByEmail(newMemberInfoDTO.getEmail()).orElseThrow(NoSuchElementException::new);
        memberEntity.memberInfoUpdate(memberEntity);

        return modelMapper.map(memberEntity,MemberDTO.class);
    }

    public boolean emailDuplicateCheck(String email) {
        return repo.findIdByEmail(email).isPresent();
    }

}
