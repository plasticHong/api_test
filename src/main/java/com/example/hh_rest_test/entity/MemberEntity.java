package com.example.hh_rest_test.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

@Entity(name = "members")
@Getter
@ToString
public class MemberEntity extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String name;

    private String nickName;

    private String phoneNumber;

    private boolean alarm_agree;

    private String location;

    private String locationDetail;


    public void memberInfoUpdate(MemberEntity memberEntity){
        this.nickName = memberEntity.nickName;
        this.alarm_agree = memberEntity.alarm_agree;
        this.phoneNumber = memberEntity.phoneNumber;
    }


}
