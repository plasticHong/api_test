package com.example.hh_rest_test.controller;


import com.example.hh_rest_test.dto.MemberDTO;
import com.example.hh_rest_test.service.MemberService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;


@Tag(name = "members",description = "회원")
@RestController
@RequestMapping("/member")
@AllArgsConstructor
public class MemberController {
    MemberService memberService;

    @Operation(summary = "get",description = "멤버 등록")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = MemberDTO.class))),
            @ApiResponse(responseCode = "400", description = "bad request operation")
    })

    @RequestMapping(method = RequestMethod.GET, value = "/save")
    public ResponseEntity<?> save(
            @Parameter(name = "member",description = "멤버 정보",schema = @Schema(implementation = MemberDTO.class))
            @RequestBody @Valid MemberDTO memberDTO) {

        MemberDTO savedMemberDTO = memberService.memberJoin(memberDTO);

        return new ResponseEntity<>(savedMemberDTO, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/update")
    public ResponseEntity<?> update(@RequestBody MemberDTO newMemberInfoDto) {

        MemberDTO updatedMemberInfoDTO = memberService.updateMember(newMemberInfoDto);

        return new ResponseEntity<>(updatedMemberInfoDTO, HttpStatus.OK);
    }

    @ApiResponse(responseCode = "200")
    @ApiResponse(responseCode = "400")
    @RequestMapping(method = RequestMethod.GET, value = "/emailCheck")
    public ResponseEntity<?> Check(
            @Parameter(name = "email",description = "중복확인용 email")
            @RequestBody String email) {

        System.out.println("request: "+email);

        boolean isDuplicated = memberService.emailDuplicateCheck(email);

        Map<String, Boolean> checkResult = new HashMap<>();
        checkResult.put("isDuplicated", isDuplicated);

        return new ResponseEntity<>(checkResult, HttpStatus.OK);


    }

}
