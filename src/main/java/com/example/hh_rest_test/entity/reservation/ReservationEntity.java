package com.example.hh_rest_test.entity.reservation;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "reservation", schema = "bancha", catalog = "")
public class ReservationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "member_id")
    private int memberId;
    @Basic
    @Column(name = "product_sale_id")
    private int productSaleId;
    @Basic
    @Column(name = "price")
    private int price;
    @Basic
    @Column(name = "used_point_value")
    private int usedPointValue;
    @Basic
    @Column(name = "total")
    private int total;
    @Basic
    @Column(name = "payment_type")
    private int paymentType;
    @Basic
    @Column(name = "createtime")
    private Timestamp createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getProductSaleId() {
        return productSaleId;
    }

    public void setProductSaleId(int productSaleId) {
        this.productSaleId = productSaleId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUsedPointValue() {
        return usedPointValue;
    }

    public void setUsedPointValue(int usedPointValue) {
        this.usedPointValue = usedPointValue;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
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
        ReservationEntity that = (ReservationEntity) o;
        return id == that.id && memberId == that.memberId && productSaleId == that.productSaleId && price == that.price && usedPointValue == that.usedPointValue && total == that.total && paymentType == that.paymentType && Objects.equals(createtime, that.createtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, productSaleId, price, usedPointValue, total, paymentType, createtime);
    }
}
