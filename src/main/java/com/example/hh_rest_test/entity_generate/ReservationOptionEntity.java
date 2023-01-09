package com.example.hh_rest_test.entity_generate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reservation_option", schema = "bancha", catalog = "")
public class ReservationOptionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "reservation_id")
    private int reservationId;
    @Basic
    @Column(name = "product_sale_option_id")
    private Integer productSaleOptionId;
    @Basic
    @Column(name = "option_price")
    private Integer optionPrice;
    @Basic
    @Column(name = "count")
    private Integer count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Integer getProductSaleOptionId() {
        return productSaleOptionId;
    }

    public void setProductSaleOptionId(Integer productSaleOptionId) {
        this.productSaleOptionId = productSaleOptionId;
    }

    public Integer getOptionPrice() {
        return optionPrice;
    }

    public void setOptionPrice(Integer optionPrice) {
        this.optionPrice = optionPrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationOptionEntity that = (ReservationOptionEntity) o;
        return id == that.id && reservationId == that.reservationId && Objects.equals(productSaleOptionId, that.productSaleOptionId) && Objects.equals(optionPrice, that.optionPrice) && Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reservationId, productSaleOptionId, optionPrice, count);
    }
}
