package com.example.hh_rest_test.entity_generate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "reservation_payment", schema = "bancha", catalog = "")
public class ReservationPaymentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "reservation_id")
    private int reservationId;
    @Basic
    @Column(name = "complete_yn")
    private boolean completeYn;
    @Basic
    @Column(name = "remark")
    private String remark;
    @Basic
    @Column(name = "createtime")
    private Timestamp createtime;
    @Basic
    @Column(name = "card_data")
    private String cardData;

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

    public boolean isCompleteYn() {
        return completeYn;
    }

    public void setCompleteYn(boolean completeYn) {
        this.completeYn = completeYn;
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

    public String getCardData() {
        return cardData;
    }

    public void setCardData(String cardData) {
        this.cardData = cardData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationPaymentEntity that = (ReservationPaymentEntity) o;
        return id == that.id && reservationId == that.reservationId && completeYn == that.completeYn && Objects.equals(remark, that.remark) && Objects.equals(createtime, that.createtime) && Objects.equals(cardData, that.cardData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reservationId, completeYn, remark, createtime, cardData);
    }
}
