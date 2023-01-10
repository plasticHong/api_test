package com.example.test_entity;

import com.example.entity.base.BaseTimeEntity;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity(name = "HH_TEST_members")
@Getter
@ToString
@DynamicInsert
public class MemberTestEntity extends BaseTimeEntity {

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


    public void memberInfoUpdate(MemberTestEntity memberTestEntity){
        this.nickName = memberTestEntity.nickName;
        this.alarm_agree = memberTestEntity.alarm_agree;
        this.phoneNumber = memberTestEntity.phoneNumber;
    }


}
