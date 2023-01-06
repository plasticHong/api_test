package com.example.hh_rest_test.dto;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Valid
@NoArgsConstructor
public class MemberDTO {
    private Long id;
    @Email
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
