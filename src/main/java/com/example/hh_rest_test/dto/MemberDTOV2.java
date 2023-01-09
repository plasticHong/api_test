package com.example.hh_rest_test.dto;

import javax.persistence.Basic;
import javax.persistence.Column;
import java.sql.Date;
import java.sql.Timestamp;

public class MemberDTOV2 {
    private String userid;
    private String email;
    private String passwd;
    private String nickname;
    private String name;
    private String cellphone;
    private boolean alarmAgree;
    private String location;
    private String locationDetail;
    private Date birthday;
    private Timestamp createtime;
    private Boolean useYn;
    private String remark;
    private Integer state;
    private Integer totalPoint;
}
