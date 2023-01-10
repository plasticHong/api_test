package com.example.entity.product;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product_review", schema = "bancha", catalog = "")
public class ProductReviewEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "product_sale_id")
    private int productSaleId;
    @Basic
    @Column(name = "member_id")
    private int memberId;
    @Basic
    @Column(name = "createtime")
    private Timestamp createtime;
    @Basic
    @Column(name = "fivestar")
    private int fivestar;
    @Basic
    @Column(name = "contents")
    private String contents;
    @Basic
    @Column(name = "image_url")
    private String imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductSaleId() {
        return productSaleId;
    }

    public void setProductSaleId(int productSaleId) {
        this.productSaleId = productSaleId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public int getFivestar() {
        return fivestar;
    }

    public void setFivestar(int fivestar) {
        this.fivestar = fivestar;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductReviewEntity that = (ProductReviewEntity) o;
        return id == that.id && productSaleId == that.productSaleId && memberId == that.memberId && fivestar == that.fivestar && Objects.equals(createtime, that.createtime) && Objects.equals(contents, that.contents) && Objects.equals(imageUrl, that.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productSaleId, memberId, createtime, fivestar, contents, imageUrl);
    }
}
