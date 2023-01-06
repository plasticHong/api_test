package com.example.hh_rest_test.controller;


import com.example.hh_rest_test.dto.MemberDTO;
import com.example.hh_rest_test.entity.MemberEntity;
import com.example.hh_rest_test.service.MemberService;
import com.google.gson.Gson;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@AllArgsConstructor
public class MemberController {
    MemberService memberService;

    @RequestMapping(method = RequestMethod.GET, value = "/member/save")
    public ResponseEntity<?> save(@RequestBody @Valid com.example.hh_rest_test.dto.MemberDTO memberDTO) {

        MemberDTO savedMemberDTO = memberService.memberJoin(memberDTO);

        return new ResponseEntity<>(savedMemberDTO, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/member/update")
    public ResponseEntity<?> update(@RequestBody MemberDTO newMemberInfoDto) {

        MemberDTO updatedMemberInfoDTO = memberService.updateMember(newMemberInfoDto);

        return new ResponseEntity<>(updatedMemberInfoDTO, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/member/emailCheck")
    public ResponseEntity<?> Check(@RequestBody Map<String, String> email) {

        boolean isDuplicated = memberService.emailDuplicateCheck(email.get("email"));

        Map<String, Boolean> checkResult = new HashMap<>();
        checkResult.put("isDuplicated", isDuplicated);

        return new ResponseEntity<>(checkResult, HttpStatus.OK);


    }

}
