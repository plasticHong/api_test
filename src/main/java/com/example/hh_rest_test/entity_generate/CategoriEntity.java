package com.example.hh_rest_test.entity_generate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "categori", schema = "bancha", catalog = "")
public class CategoriEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "recommend_num")
    private int recommendNum;
    @Basic
    @Column(name = "remark")
    private String remark;
    @Basic
    @Column(name = "use_yn")
    private Boolean useYn;
    @Basic
    @Column(name = "createtime")
    private Timestamp createtime;
    @Basic
    @Column(name = "thumbnail_image_url")
    private String thumbnailImageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecommendNum() {
        return recommendNum;
    }

    public void setRecommendNum(int recommendNum) {
        this.recommendNum = recommendNum;
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

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    public void setThumbnailImageUrl(String thumbnailImageUrl) {
        this.thumbnailImageUrl = thumbnailImageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriEntity that = (CategoriEntity) o;
        return id == that.id && recommendNum == that.recommendNum && Objects.equals(name, that.name) && Objects.equals(remark, that.remark) && Objects.equals(useYn, that.useYn) && Objects.equals(createtime, that.createtime) && Objects.equals(thumbnailImageUrl, that.thumbnailImageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, recommendNum, remark, useYn, createtime, thumbnailImageUrl);
    }
}
