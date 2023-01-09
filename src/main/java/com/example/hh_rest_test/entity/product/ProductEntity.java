package com.example.hh_rest_test.entity.product;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "bancha", catalog = "")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "partner_id")
    private int partnerId;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "basic_user_number")
    private Integer basicUserNumber;
    @Basic
    @Column(name = "reservation_day")
    private String reservationDay;
    @Basic
    @Column(name = "facilities")
    private String facilities;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "program_content_text")
    private String programContentText;
    @Basic
    @Column(name = "include")
    private String include;
    @Basic
    @Column(name = "recomment_age")
    private String recommentAge;
    @Basic
    @Column(name = "product_text")
    private String productText;
    @Basic
    @Column(name = "product_image_url")
    private String productImageUrl;
    @Basic
    @Column(name = "use_yn")
    private Boolean useYn;
    @Basic
    @Column(name = "remark")
    private String remark;
    @Basic
    @Column(name = "createtime")
    private Timestamp createtime;
    @Basic
    @Column(name = "thumbnail_city")
    private String thumbnailCity;
    @Basic
    @Column(name = "thumbnail_01")
    private String thumbnail01;
    @Basic
    @Column(name = "thumbnail_02")
    private String thumbnail02;
    @Basic
    @Column(name = "latitude")
    private String latitude;
    @Basic
    @Column(name = "longitude")
    private String longitude;
    @Basic
    @Column(name = "retund_type_id")
    private Integer retundTypeId;
    @Basic
    @Column(name = "refund_image_url")
    private String refundImageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getBasicUserNumber() {
        return basicUserNumber;
    }

    public void setBasicUserNumber(Integer basicUserNumber) {
        this.basicUserNumber = basicUserNumber;
    }

    public String getReservationDay() {
        return reservationDay;
    }

    public void setReservationDay(String reservationDay) {
        this.reservationDay = reservationDay;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProgramContentText() {
        return programContentText;
    }

    public void setProgramContentText(String programContentText) {
        this.programContentText = programContentText;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public String getRecommentAge() {
        return recommentAge;
    }

    public void setRecommentAge(String recommentAge) {
        this.recommentAge = recommentAge;
    }

    public String getProductText() {
        return productText;
    }

    public void setProductText(String productText) {
        this.productText = productText;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public Boolean getUseYn() {
        return useYn;
    }

    public void setUseYn(Boolean useYn) {
        this.useYn = useYn;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public String getThumbnailCity() {
        return thumbnailCity;
    }

    public void setThumbnailCity(String thumbnailCity) {
        this.thumbnailCity = thumbnailCity;
    }

    public String getThumbnail01() {
        return thumbnail01;
    }

    public void setThumbnail01(String thumbnail01) {
        this.thumbnail01 = thumbnail01;
    }

    public String getThumbnail02() {
        return thumbnail02;
    }

    public void setThumbnail02(String thumbnail02) {
        this.thumbnail02 = thumbnail02;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Integer getRetundTypeId() {
        return retundTypeId;
    }

    public void setRetundTypeId(Integer retundTypeId) {
        this.retundTypeId = retundTypeId;
    }

    public String getRefundImageUrl() {
        return refundImageUrl;
    }

    public void setRefundImageUrl(String refundImageUrl) {
        this.refundImageUrl = refundImageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return id == that.id && partnerId == that.partnerId && Objects.equals(title, that.title) && Objects.equals(basicUserNumber, that.basicUserNumber) && Objects.equals(reservationDay, that.reservationDay) && Objects.equals(facilities, that.facilities) && Objects.equals(address, that.address) && Objects.equals(programContentText, that.programContentText) && Objects.equals(include, that.include) && Objects.equals(recommentAge, that.recommentAge) && Objects.equals(productText, that.productText) && Objects.equals(productImageUrl, that.productImageUrl) && Objects.equals(useYn, that.useYn) && Objects.equals(remark, that.remark) && Objects.equals(createtime, that.createtime) && Objects.equals(thumbnailCity, that.thumbnailCity) && Objects.equals(thumbnail01, that.thumbnail01) && Objects.equals(thumbnail02, that.thumbnail02) && Objects.equals(latitude, that.latitude) && Objects.equals(longitude, that.longitude) && Objects.equals(retundTypeId, that.retundTypeId) && Objects.equals(refundImageUrl, that.refundImageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, partnerId, title, basicUserNumber, reservationDay, facilities, address, programContentText, include, recommentAge, productText, productImageUrl, useYn, remark, createtime, thumbnailCity, thumbnail01, thumbnail02, latitude, longitude, retundTypeId, refundImageUrl);
    }
}
