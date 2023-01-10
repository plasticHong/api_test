package com.example.entity.product;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_event_salelist", schema = "bancha", catalog = "")
public class ProductEventSalelistEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "product_event_id")
    private Integer productEventId;
    @Basic
    @Column(name = "product_sale_id")
    private Integer productSaleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getProductEventId() {
        return productEventId;
    }

    public void setProductEventId(Integer productEventId) {
        this.productEventId = productEventId;
    }

    public Integer getProductSaleId() {
        return productSaleId;
    }

    public void setProductSaleId(Integer productSaleId) {
        this.productSaleId = productSaleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEventSalelistEntity that = (ProductEventSalelistEntity) o;
        return id == that.id && Objects.equals(productEventId, that.productEventId) && Objects.equals(productSaleId, that.productSaleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productEventId, productSaleId);
    }
}
