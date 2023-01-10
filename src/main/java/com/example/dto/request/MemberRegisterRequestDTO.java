package com.example.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Data
@Valid
@NoArgsConstructor
public class MemberRegisterRequestDTO {

    /*
    *
    * 회원가입 요청용 dto
    *
    *
    * */

    @NotBlank
    private String userid;
    @Email      //email 형식만 허용
    @Schema(description = "이메일",name = "email")
    private String email;
    @NotBlank       //  "", " ", null 허용x
    private String password;
    @NotBlank
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

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

}
