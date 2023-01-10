package com.example.entity.member;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "member_point_type", schema = "bancha", catalog = "")
public class MemberPointTypeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "point_name")
    private String pointName;
    @Basic
    @Column(name = "point_value")
    private int pointValue;
    @Basic
    @Column(name = "manager_id")
    private Integer managerId;
    @Basic
    @Column(name = "remark")
    private String remark;
    @Basic
    @Column(name = "use_yn")
    private Boolean useYn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getUseYn() {
        return useYn;
    }

    public void setUseYn(Boolean useYn) {
        this.useYn = useYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberPointTypeEntity that = (MemberPointTypeEntity) o;
        return id == that.id && pointValue == that.pointValue && Objects.equals(pointName, that.pointName) && Objects.equals(managerId, that.managerId) && Objects.equals(remark, that.remark) && Objects.equals(useYn, that.useYn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pointName, pointValue, managerId, remark, useYn);
    }
}
