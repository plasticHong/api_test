package com.example.hh_rest_test.entity;

import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity(name = "members_HH")
@Getter
@ToString
@DynamicInsert
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

    @Column(columnDefinition = "boolean default true",nullable = false)
    private boolean use_YN;


    public void memberInfoUpdate(MemberEntity memberEntity){
        this.nickName = memberEntity.nickName;
        this.alarm_agree = memberEntity.alarm_agree;
        this.phoneNumber = memberEntity.phoneNumber;
    }


}
