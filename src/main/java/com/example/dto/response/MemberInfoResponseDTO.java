package com.example.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Getter
@Schema(description = "회원 정보",name = "member")
public class MemberInfoResponseDTO {

/*
*
* 회원 정보 요청시, 응답용 dto
*
*
* */

    private String userid;
    @Schema(description = "이메일",example = "hh.son@khsystems.com")
    private String email;
    private String password;
    @Schema(description = "이름",example = "이름")
    private String name;
    @Schema(description = "닉네임",example = "닉네임")
    private String nickName;
    @Schema(description = "휴대폰",example = "010-9999-9999")
    private String cellphone;

    @Schema(description = "알람 동의여부")
    private boolean alarm_agree;
    @Schema(description = "주소",example = "주소")
    private String location;
    @Schema(description = "상세주소",example = "상세주소")
    private String locationDetail;
    private Date birthday;
    private String createTime;


}
