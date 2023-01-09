package com.example.hh_rest_test.entity_generate;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product_sale_exception", schema = "bancha", catalog = "")
public class ProductSaleExceptionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "product_id")
    private int productId;
    @Basic
    @Column(name = "ex_sale_date")
    private Date exSaleDate;
    @Basic
    @Column(name = "createtime")
    private Timestamp createtime;
    @Basic
    @Column(name = "remark")
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getExSaleDate() {
        return exSaleDate;
    }

    public void setExSaleDate(Date exSaleDate) {
        this.exSaleDate = exSaleDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSaleExceptionEntity that = (ProductSaleExceptionEntity) o;
        return id == that.id && productId == that.productId && Objects.equals(exSaleDate, that.exSaleDate) && Objects.equals(createtime, that.createtime) && Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, exSaleDate, createtime, remark);
    }
}
