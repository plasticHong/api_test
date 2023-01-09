package com.example.hh_rest_test.entity_generate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_section_salelist", schema = "bancha", catalog = "")
public class ProductSectionSalelistEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "product_section_id")
    private int productSectionId;
    @Basic
    @Column(name = "product_sale_id")
    private int productSaleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductSectionId() {
        return productSectionId;
    }

    public void setProductSectionId(int productSectionId) {
        this.productSectionId = productSectionId;
    }

    public int getProductSaleId() {
        return productSaleId;
    }

    public void setProductSaleId(int productSaleId) {
        this.productSaleId = productSaleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSectionSalelistEntity that = (ProductSectionSalelistEntity) o;
        return id == that.id && productSectionId == that.productSectionId && productSaleId == that.productSaleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productSectionId, productSaleId);
    }
}
