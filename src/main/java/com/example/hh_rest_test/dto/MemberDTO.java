package com.example.hh_rest_test.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Valid
@NoArgsConstructor
@Schema(description = "회원 정보",name = "member")
public class MemberDTO {

    @Schema(description = "PK 자동 증가값")
    private Long id;
    @Email
    @Schema(description = "이메일",name = "email")
    private String email;
    private String password;
    @NotBlank
    private String name;
    private String nickName;
    private String phoneNumber;
    private boolean alarm_agree;
    private String location;
    private String locationDetail;
    private String createTime;
    private String modifiedTime;


}
