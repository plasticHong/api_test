package com.example.hh_rest_test.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.sql.Date;

@Builder
@Data
@Valid
public class MemberRegisterRequestDTO {

    @Email      //email 형식만 허용
    @Schema(description = "이메일",name = "email")
    private String email;
    @NotBlank
    private String password;
    @NotBlank    //  "", " ", null 허용x
    private String name;
    @NotBlank
    private String nickName;
    @NotBlank
    private String cellphone;
    private boolean alarm_agree;
    @NotBlank
    private String location;
    @NotBlank
    private String locationDetail;
    private Date birthday;
    private String createTime;
    private String modifiedTime;



}
