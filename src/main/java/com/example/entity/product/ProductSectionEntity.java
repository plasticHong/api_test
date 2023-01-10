package com.example.entity.product;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product_section", schema = "bancha", catalog = "")
public class ProductSectionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "createtime")
    private Timestamp createtime;
    @Basic
    @Column(name = "remark")
    private String remark;
    @Basic
    @Column(name = "use_yn")
    private Boolean useYn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
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
        ProductSectionEntity that = (ProductSectionEntity) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(createtime, that.createtime) && Objects.equals(remark, that.remark) && Objects.equals(useYn, that.useYn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, createtime, remark, useYn);
    }
}
