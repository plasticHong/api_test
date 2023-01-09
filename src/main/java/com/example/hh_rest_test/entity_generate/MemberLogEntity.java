package com.example.hh_rest_test.entity_generate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "member_log", schema = "bancha", catalog = "")
public class MemberLogEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "member_id")
    private int memberId;
    @Basic
    @Column(name = "log_time")
    private Timestamp logTime;
    @Basic
    @Column(name = "product_sale_id")
    private Integer productSaleId;
    @Basic
    @Column(name = "latitude")
    private String latitude;
    @Basic
    @Column(name = "longitude")
    private String longitude;
    @Basic
    @Column(name = "OS")
    private String os;
    @Basic
    @Column(name = "page_url")
    private String pageUrl;
    @Basic
    @Column(name = "ipaddress")
    private String ipaddress;

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

    public Timestamp getLogTime() {
        return logTime;
    }

    public void setLogTime(Timestamp logTime) {
        this.logTime = logTime;
    }

    public Integer getProductSaleId() {
        return productSaleId;
    }

    public void setProductSaleId(Integer productSaleId) {
        this.productSaleId = productSaleId;
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

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberLogEntity that = (MemberLogEntity) o;
        return id == that.id && memberId == that.memberId && Objects.equals(logTime, that.logTime) && Objects.equals(productSaleId, that.productSaleId) && Objects.equals(latitude, that.latitude) && Objects.equals(longitude, that.longitude) && Objects.equals(os, that.os) && Objects.equals(pageUrl, that.pageUrl) && Objects.equals(ipaddress, that.ipaddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, logTime, productSaleId, latitude, longitude, os, pageUrl, ipaddress);
    }
}
