package com.example.hh_rest_test.service;


import com.example.hh_rest_test.dto.MemberDTO;
import com.example.hh_rest_test.dto.request.MemberRegisterRequestDTO;
import com.example.hh_rest_test.entity.member.MemberEntity;
import com.example.hh_rest_test.repository.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@AllArgsConstructor
@Service
@Slf4j
public class MemberService {
    MemberRepository repo;
    ModelMapper modelMapper;


    @Transactional
    public MemberDTO memberJoin(MemberRegisterRequestDTO memberDTO) {

      MemberEntity save = repo.save(modelMapper.map(memberDTO, MemberEntity.class));
        log.info(save.toString());
        return modelMapper.map(save, MemberDTO.class);

    }


    @Transactional
    public MemberDTO updateMember(@NonNull MemberDTO newMemberInfoDTO) {

        MemberEntity memberEntity = repo.findByEmail(newMemberInfoDTO.getEmail()).orElseThrow(NoSuchElementException::new);
//        memberEntity.memberInfoUpdate(memberEntity);

        return modelMapper.map(memberEntity,MemberDTO.class);
    }

    public boolean emailDuplicateCheck(String email) {
        return repo.findIdByEmail(email).isPresent();
    }

}
