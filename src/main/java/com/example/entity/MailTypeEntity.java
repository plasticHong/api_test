package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mail_type", schema = "bancha", catalog = "")
public class MailTypeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "content")
    private String content;
    @Basic
    @Column(name = "remark")
    private String remark;
    @Basic
    @Column(name = "use_yn")
    private Boolean useYn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getUseYn() {
        return useYn;
    }

    public void setUseYn(Boolean useYn) {
        this.useYn = useYn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MailTypeEntity that = (MailTypeEntity) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(content, that.content) && Objects.equals(remark, that.remark) && Objects.equals(useYn, that.useYn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, remark, useYn);
    }
}
