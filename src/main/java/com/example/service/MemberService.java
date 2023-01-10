package com.example.service;


import com.example.dto.MemberDTO;
import com.example.dto.request.MemberRegisterRequestDTO;
import com.example.dto.response.MemberInfoResponseDTO;
import com.example.entity.member.MemberEntity;
import com.example.repository.MemberRepository;
import com.example.repository.MemberRepositoryImpl;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;
import java.util.Optional;

@AllArgsConstructor
@Service
@Slf4j
public class MemberService {
    MemberRepository repo;

    MemberRepositoryImpl customRepo;
    ModelMapper modelMapper;


    @Transactional
    public MemberInfoResponseDTO memberJoin(MemberRegisterRequestDTO memberDTO) {

      MemberEntity save = repo.save(modelMapper.map(memberDTO, MemberEntity.class));
        log.info(save.toString());
        return modelMapper.map(save, MemberInfoResponseDTO.class);

    }


    public MemberInfoResponseDTO getMemberInfoByEmail(String email){

        Optional<MemberEntity> byEmail = repo.findByEmail(email);

        if(byEmail.isPresent()){
            MemberEntity memberEntity = byEmail.get();
            return modelMapper.map(memberEntity,MemberInfoResponseDTO.class);
        }else {
            throw new NoSuchElementException();
        }

    }

    @Transactional
    public MemberDTO updateMember(@NonNull MemberRegisterRequestDTO newMemberInfoDTO) {

//        조회 (email)
        MemberEntity memberEntity = repo.findByEmail(newMemberInfoDTO.getEmail()).orElseThrow(NoSuchElementException::new);
        log.info(memberEntity.toString());
//        업데이트
        memberEntity.memberInfoUpdate(newMemberInfoDTO);
        log.info(memberEntity.toString());
        return modelMapper.map(memberEntity,MemberDTO.class);
    }

    public boolean emailDuplicateCheck(String email) {

        /*
        * useYn 관계없이 검색
        * */
//        return repo.findIdByEmail(email).isPresent();


        /*
        * useYn : true 만 검색
        * */
        return customRepo.findIdByEmail(email).isPresent();

    }

}
