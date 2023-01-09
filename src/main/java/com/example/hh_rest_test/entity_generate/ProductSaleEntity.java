package com.example.hh_rest_test.entity_generate;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product_sale", schema = "bancha", catalog = "")
public class ProductSaleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "product_id")
    private int productId;
    @Basic
    @Column(name = "auto_confirmed_yn")
    private boolean autoConfirmedYn;
    @Basic
    @Column(name = "sale_date")
    private Date saleDate;
    @Basic
    @Column(name = "sale_type")
    private int saleType;
    @Basic
    @Column(name = "reservation_deadline_num")
    private Integer reservationDeadlineNum;
    @Basic
    @Column(name = "pre_price")
    private Integer prePrice;
    @Basic
    @Column(name = "after_price")
    private Integer afterPrice;
    @Basic
    @Column(name = "buy_qty_min")
    private Integer buyQtyMin;
    @Basic
    @Column(name = "buy_qty_max")
    private Integer buyQtyMax;
    @Basic
    @Column(name = "remark")
    private String remark;
    @Basic
    @Column(name = "createtime")
    private Timestamp createtime;
    @Basic
    @Column(name = "age_min")
    private Integer ageMin;
    @Basic
    @Column(name = "age_max")
    private Integer ageMax;
    @Basic
    @Column(name = "use_minute")
    private Integer useMinute;
    @Basic
    @Column(name = "firstline_contents")
    private String firstlineContents;
    @Basic
    @Column(name = "contents")
    private String contents;
    @Basic
    @Column(name = "schedule")
    private String schedule;
    @Basic
    @Column(name = "check_list")
    private String checkList;
    @Basic
    @Column(name = "notice")
    private String notice;
    @Basic
    @Column(name = "open_time")
    private Timestamp openTime;
    @Basic
    @Column(name = "close_time")
    private Timestamp closeTime;

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

    public boolean isAutoConfirmedYn() {
        return autoConfirmedYn;
    }

    public void setAutoConfirmedYn(boolean autoConfirmedYn) {
        this.autoConfirmedYn = autoConfirmedYn;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public int getSaleType() {
        return saleType;
    }

    public void setSaleType(int saleType) {
        this.saleType = saleType;
    }

    public Integer getReservationDeadlineNum() {
        return reservationDeadlineNum;
    }

    public void setReservationDeadlineNum(Integer reservationDeadlineNum) {
        this.reservationDeadlineNum = reservationDeadlineNum;
    }

    public Integer getPrePrice() {
        return prePrice;
    }

    public void setPrePrice(Integer prePrice) {
        this.prePrice = prePrice;
    }

    public Integer getAfterPrice() {
        return afterPrice;
    }

    public void setAfterPrice(Integer afterPrice) {
        this.afterPrice = afterPrice;
    }

    public Integer getBuyQtyMin() {
        return buyQtyMin;
    }

    public void setBuyQtyMin(Integer buyQtyMin) {
        this.buyQtyMin = buyQtyMin;
    }

    public Integer getBuyQtyMax() {
        return buyQtyMax;
    }

    public void setBuyQtyMax(Integer buyQtyMax) {
        this.buyQtyMax = buyQtyMax;
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

    public Integer getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(Integer ageMin) {
        this.ageMin = ageMin;
    }

    public Integer getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(Integer ageMax) {
        this.ageMax = ageMax;
    }

    public Integer getUseMinute() {
        return useMinute;
    }

    public void setUseMinute(Integer useMinute) {
        this.useMinute = useMinute;
    }

    public String getFirstlineContents() {
        return firstlineContents;
    }

    public void setFirstlineContents(String firstlineContents) {
        this.firstlineContents = firstlineContents;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getCheckList() {
        return checkList;
    }

    public void setCheckList(String checkList) {
        this.checkList = checkList;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public Timestamp getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Timestamp openTime) {
        this.openTime = openTime;
    }

    public Timestamp getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Timestamp closeTime) {
        this.closeTime = closeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSaleEntity that = (ProductSaleEntity) o;
        return id == that.id && productId == that.productId && autoConfirmedYn == that.autoConfirmedYn && saleType == that.saleType && Objects.equals(saleDate, that.saleDate) && Objects.equals(reservationDeadlineNum, that.reservationDeadlineNum) && Objects.equals(prePrice, that.prePrice) && Objects.equals(afterPrice, that.afterPrice) && Objects.equals(buyQtyMin, that.buyQtyMin) && Objects.equals(buyQtyMax, that.buyQtyMax) && Objects.equals(remark, that.remark) && Objects.equals(createtime, that.createtime) && Objects.equals(ageMin, that.ageMin) && Objects.equals(ageMax, that.ageMax) && Objects.equals(useMinute, that.useMinute) && Objects.equals(firstlineContents, that.firstlineContents) && Objects.equals(contents, that.contents) && Objects.equals(schedule, that.schedule) && Objects.equals(checkList, that.checkList) && Objects.equals(notice, that.notice) && Objects.equals(openTime, that.openTime) && Objects.equals(closeTime, that.closeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, autoConfirmedYn, saleDate, saleType, reservationDeadlineNum, prePrice, afterPrice, buyQtyMin, buyQtyMax, remark, createtime, ageMin, ageMax, useMinute, firstlineContents, contents, schedule, checkList, notice, openTime, closeTime);
    }
}
