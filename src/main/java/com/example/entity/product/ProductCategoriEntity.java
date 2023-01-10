package com.example.entity.product;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product_categori", schema = "bancha", catalog = "")
public class ProductCategoriEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "product_id")
    private int productId;
    @Basic
    @Column(name = "categori_id")
    private int categoriId;
    @Basic
    @Column(name = "seq")
    private int seq;
    @Basic
    @Column(name = "createtime")
    private Timestamp createtime;

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

    public int getCategoriId() {
        return categoriId;
    }

    public void setCategoriId(int categoriId) {
        this.categoriId = categoriId;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCategoriEntity that = (ProductCategoriEntity) o;
        return id == that.id && productId == that.productId && categoriId == that.categoriId && seq == that.seq && Objects.equals(createtime, that.createtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, categoriId, seq, createtime);
    }
}
