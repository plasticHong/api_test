package com.example.controller;


import com.example.api_doc.BasicApiResponse;
import com.example.dto.MemberDTO;
import com.example.dto.request.MemberRegisterRequestDTO;
import com.example.dto.response.MemberInfoResponseDTO;
import com.example.service.MemberService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;


@Tag(name = "members", description = "회원")
@RestController
@RequestMapping("/member")
@AllArgsConstructor
public class MemberController {
    MemberService memberService;

    @Operation(summary = "회원가입", description = "회원가입 api")
    @BasicApiResponse
    @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = MemberInfoResponseDTO.class)))
    @RequestMapping(method = RequestMethod.POST, value = "/save")
    public ResponseEntity<?> save(
            @Parameter(name = "member", description = "멤버 정보", schema = @Schema(implementation = MemberRegisterRequestDTO.class))
            @RequestBody @Valid MemberRegisterRequestDTO memberDTO) {

        MemberInfoResponseDTO savedMemberDTO = memberService.memberJoin(memberDTO);

        return new ResponseEntity<>(savedMemberDTO, HttpStatus.OK);
    }


    @Operation(summary = "회원정보 요청",description = "회원정보 요청")
    @BasicApiResponse
    @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = MemberInfoResponseDTO.class)))
    @RequestMapping(method = RequestMethod.GET, value = "/info")
    public ResponseEntity<?> userInfo(@RequestParam String email) {

        try {
            MemberInfoResponseDTO memberInfoByEmail = memberService.getMemberInfoByEmail(email);
            return new ResponseEntity<>(memberInfoByEmail, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

    }


    @BasicApiResponse
    @RequestMapping(method = RequestMethod.POST, value = "/update")
    public ResponseEntity<?> update(@Parameter(name = "email",description = "해당 유저의 정보를 조회함")
                                    @RequestBody MemberRegisterRequestDTO newMemberInfoDto) {

        MemberDTO updatedMemberInfoDTO = memberService.updateMember(newMemberInfoDto);

        return new ResponseEntity<>(updatedMemberInfoDTO, HttpStatus.OK);
    }

    @BasicApiResponse
    @RequestMapping(method = RequestMethod.GET, value = "/emailCheck")
    public ResponseEntity<?> Check(@Parameter(name = "email", description = "중복확인용 email")
                                   @RequestParam String email) {

        boolean isDuplicated = memberService.emailDuplicateCheck(email);

        Map<String, Boolean> checkResult = new HashMap<>();
        checkResult.put("isDuplicated", isDuplicated);

        return new ResponseEntity<>(checkResult, HttpStatus.OK);
    }

}
