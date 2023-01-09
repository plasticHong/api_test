package com.example.hh_rest_test.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "partner", schema = "bancha", catalog = "")
public class PartnerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "partnerid")
    private String partnerid;
    @Basic
    @Column(name = "biz_name")
    private String bizName;
    @Basic
    @Column(name = "ceo_name")
    private String ceoName;
    @Basic
    @Column(name = "manager_id")
    private Integer managerId;
    @Basic
    @Column(name = "certification")
    private boolean certification;
    @Basic
    @Column(name = "biz_number")
    private String bizNumber;
    @Basic
    @Column(name = "bank_image")
    private byte[] bankImage;
    @Basic
    @Column(name = "cellphone")
    private String cellphone;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "pees")
    private int pees;
    @Basic
    @Column(name = "use_yn")
    private Boolean useYn;
    @Basic
    @Column(name = "createtime")
    private Timestamp createtime;
    @Basic
    @Column(name = "remark")
    private String remark;
    @Basic
    @Column(name = "state")
    private Integer state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public boolean isCertification() {
        return certification;
    }

    public void setCertification(boolean certification) {
        this.certification = certification;
    }

    public String getBizNumber() {
        return bizNumber;
    }

    public void setBizNumber(String bizNumber) {
        this.bizNumber = bizNumber;
    }

    public byte[] getBankImage() {
        return bankImage;
    }

    public void setBankImage(byte[] bankImage) {
        this.bankImage = bankImage;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPees() {
        return pees;
    }

    public void setPees(int pees) {
        this.pees = pees;
    }

    public Boolean getUseYn() {
        return useYn;
    }

    public void setUseYn(Boolean useYn) {
        this.useYn = useYn;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartnerEntity that = (PartnerEntity) o;
        return id == that.id && certification == that.certification && pees == that.pees && Objects.equals(partnerid, that.partnerid) && Objects.equals(bizName, that.bizName) && Objects.equals(ceoName, that.ceoName) && Objects.equals(managerId, that.managerId) && Objects.equals(bizNumber, that.bizNumber) && Arrays.equals(bankImage, that.bankImage) && Objects.equals(cellphone, that.cellphone) && Objects.equals(address, that.address) && Objects.equals(useYn, that.useYn) && Objects.equals(createtime, that.createtime) && Objects.equals(remark, that.remark) && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, partnerid, bizName, ceoName, managerId, certification, bizNumber, cellphone, address, pees, useYn, createtime, remark, state);
        result = 31 * result + Arrays.hashCode(bankImage);
        return result;
    }
}
