package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "refund_type", schema = "bancha", catalog = "")
public class RefundTypeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "remark")
    private String remark;
    @Basic
    @Column(name = "createtime")
    private Date createtime;
    @Basic
    @Column(name = "use_yn")
    private Boolean useYn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        RefundTypeEntity that = (RefundTypeEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(remark, that.remark) && Objects.equals(createtime, that.createtime) && Objects.equals(useYn, that.useYn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, remark, createtime, useYn);
    }
}
