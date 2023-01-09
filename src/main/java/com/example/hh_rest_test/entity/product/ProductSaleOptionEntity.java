package com.example.hh_rest_test.entity.product;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_sale_option", schema = "bancha", catalog = "")
public class ProductSaleOptionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "product_sale_id")
    private int productSaleId;
    @Basic
    @Column(name = "number")
    private int number;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "contents")
    private String contents;
    @Basic
    @Column(name = "option_price")
    private Integer optionPrice;
    @Basic
    @Column(name = "option_stock")
    private Integer optionStock;

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Integer getOptionPrice() {
        return optionPrice;
    }

    public void setOptionPrice(Integer optionPrice) {
        this.optionPrice = optionPrice;
    }

    public Integer getOptionStock() {
        return optionStock;
    }

    public void setOptionStock(Integer optionStock) {
        this.optionStock = optionStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSaleOptionEntity that = (ProductSaleOptionEntity) o;
        return id == that.id && productSaleId == that.productSaleId && number == that.number && Objects.equals(title, that.title) && Objects.equals(contents, that.contents) && Objects.equals(optionPrice, that.optionPrice) && Objects.equals(optionStock, that.optionStock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productSaleId, number, title, contents, optionPrice, optionStock);
    }
}
