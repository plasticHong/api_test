package com.example.hh_rest_test.entity_generate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "member_point", schema = "bancha", catalog = "")
public class MemberPointEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "member_id")
//    @ManyToOne
//    @JoinColumn(name = "member_id")
    private Long memberId;

//    @OneToOne
//    @JoinColumn(name = "point_type_id")
    @Column(name = "point_type_id")
    private Long pointTypeId;


    @Basic
    @Column(name = "remark")
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getPointTypeId() {
        return pointTypeId;
    }

    public void setPointTypeId(Long pointTypeId) {
        this.pointTypeId = pointTypeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberPointEntity that = (MemberPointEntity) o;
        return id == that.id && memberId == that.memberId && pointTypeId == that.pointTypeId && Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, pointTypeId, remark);
    }
}
