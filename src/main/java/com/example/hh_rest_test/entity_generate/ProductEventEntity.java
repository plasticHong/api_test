package com.example.hh_rest_test.entity_generate;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product_event", schema = "bancha", catalog = "")
public class ProductEventEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "product_sale_id")
    private int productSaleId;
    @Basic
    @Column(name = "image_url")
    private String imageUrl;
    @Basic
    @Column(name = "from_date")
    private Date fromDate;
    @Basic
    @Column(name = "enddt_date")
    private Date enddtDate;
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

    public int getProductSaleId() {
        return productSaleId;
    }

    public void setProductSaleId(int productSaleId) {
        this.productSaleId = productSaleId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getEnddtDate() {
        return enddtDate;
    }

    public void setEnddtDate(Date enddtDate) {
        this.enddtDate = enddtDate;
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
        ProductEventEntity that = (ProductEventEntity) o;
        return id == that.id && productSaleId == that.productSaleId && Objects.equals(imageUrl, that.imageUrl) && Objects.equals(fromDate, that.fromDate) && Objects.equals(enddtDate, that.enddtDate) && Objects.equals(createtime, that.createtime) && Objects.equals(remark, that.remark) && Objects.equals(useYn, that.useYn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productSaleId, imageUrl, fromDate, enddtDate, createtime, remark, useYn);
    }
}
