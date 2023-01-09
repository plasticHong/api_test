package com.example.hh_rest_test.entity_generate;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "banner", schema = "bancha", catalog = "")
public class BannerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "image_url")
    private String imageUrl;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "remark")
    private String remark;
    @Basic
    @Column(name = "createtime")
    private Date createtime;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        BannerEntity that = (BannerEntity) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(imageUrl, that.imageUrl) && Objects.equals(url, that.url) && Objects.equals(remark, that.remark) && Objects.equals(createtime, that.createtime) && Objects.equals(useYn, that.useYn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, imageUrl, url, remark, createtime, useYn);
    }
}
