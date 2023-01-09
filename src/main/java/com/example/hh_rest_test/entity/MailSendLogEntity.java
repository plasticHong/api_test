package com.example.hh_rest_test.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "mail_send_log", schema = "bancha", catalog = "")
public class MailSendLogEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "mail_type")
    private int mailType;
    @Basic
    @Column(name = "createtime")
    private Timestamp createtime;
    @Basic
    @Column(name = "complete_yn")
    private Boolean completeYn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMailType() {
        return mailType;
    }

    public void setMailType(int mailType) {
        this.mailType = mailType;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Boolean getCompleteYn() {
        return completeYn;
    }

    public void setCompleteYn(Boolean completeYn) {
        this.completeYn = completeYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MailSendLogEntity that = (MailSendLogEntity) o;
        return id == that.id && mailType == that.mailType && Objects.equals(email, that.email) && Objects.equals(createtime, that.createtime) && Objects.equals(completeYn, that.completeYn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, mailType, createtime, completeYn);
    }
}
