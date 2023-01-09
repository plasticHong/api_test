package com.example.hh_rest_test.entity_generate;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "member", schema = "bancha", catalog = "")
public class MemberEntity {
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
    @Column(name = "createtime")
    private Timestamp createtime;
    @Column(name = "use_yn")
    private Boolean useYn;
    @Column(name = "remark")
    private String remark;
    @Column(name = "state")
    private Integer state;
    @Column(name = "total_point")
    private Integer totalPoint;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public boolean isAlarmAgree() {
        return alarmAgree;
    }

    public void setAlarmAgree(boolean alarmAgree) {
        this.alarmAgree = alarmAgree;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationDetail() {
        return locationDetail;
    }

    public void setLocationDetail(String locationDetail) {
        this.locationDetail = locationDetail;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Boolean getUseYn() {
        return useYn;
    }

    public void setUseYn(Boolean useYn) {
        this.useYn = useYn;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(Integer totalPoint) {
        this.totalPoint = totalPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberEntity that = (MemberEntity) o;
        return id == that.id && alarmAgree == that.alarmAgree && Objects.equals(userid, that.userid) && Objects.equals(email, that.email) && Objects.equals(passwd, that.passwd) && Objects.equals(nickname, that.nickname) && Objects.equals(name, that.name) && Objects.equals(cellphone, that.cellphone) && Objects.equals(location, that.location) && Objects.equals(locationDetail, that.locationDetail) && Objects.equals(birthday, that.birthday) && Objects.equals(createtime, that.createtime) && Objects.equals(useYn, that.useYn) && Objects.equals(remark, that.remark) && Objects.equals(state, that.state) && Objects.equals(totalPoint, that.totalPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userid, email, passwd, nickname, name, cellphone, alarmAgree, location, locationDetail, birthday, createtime, useYn, remark, state, totalPoint);
    }
}
