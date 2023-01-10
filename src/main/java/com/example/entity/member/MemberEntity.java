package com.example.entity.member;

import com.example.dto.request.MemberRegisterRequestDTO;
import com.example.entity.base.BaseTimeEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Getter
@ToString
@Table(name = "member", schema = "bancha")
@DynamicInsert
public class MemberEntity extends BaseTimeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "userid")
    private String userid;
    @Column(name = "email")
    private String email;
    @Column(name = "passwd")
    private String passwd;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "name")
    private String name;
    @Column(name = "cellphone")
    private String cellphone;
    @Column(name = "alarm_agree")
    private boolean alarmAgree;
    @Column(name = "location")
    private String location;
    @Column(name = "location_detail")
    private String locationDetail;
    @Column(name = "birthday")
    private Date birthday;

//    @Column(name = "createtime")
//    private Timestamp createtime;
    @Column(name = "use_yn",columnDefinition = "boolean default true")
    private Boolean useYn;
    @Column(name = "remark")
    private String remark;
    @Column(name = "state",columnDefinition = "int default 0")
    private Integer state;
    @Column(name = "total_point")
    private Integer totalPoint;

    @Override
    public void onPrePersist() {
        super.onPrePersist();
        if(Objects.isNull(this.state)) this.state = 1;
        if(Objects.isNull(this.useYn)) this.useYn = true;
        if(Objects.isNull(this.totalPoint)) this.totalPoint = 0;
    }

    /*
    * memberInfo update 가능한 요소 여기서 추가/삭제
    * */
    public void memberInfoUpdate(MemberRegisterRequestDTO newMemberInfo){
        this.nickname = newMemberInfo.getNickName();
        this.alarmAgree = newMemberInfo.isAlarm_agree();
        this.cellphone = newMemberInfo.getCellphone();
        this.birthday = newMemberInfo.getBirthday();
        this.location = newMemberInfo.getLocation();
        this.locationDetail = newMemberInfo.getLocationDetail();
    }



}
