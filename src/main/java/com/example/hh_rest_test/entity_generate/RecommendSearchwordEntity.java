package com.example.hh_rest_test.entity_generate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "recommend_searchword", schema = "bancha", catalog = "")
public class RecommendSearchwordEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "word")
    private String word;
    @Basic
    @Column(name = "use_yn")
    private Boolean useYn;
    @Basic
    @Column(name = "remark")
    private String remark;
    @Basic
    @Column(name = "createtime")
    private Timestamp createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecommendSearchwordEntity that = (RecommendSearchwordEntity) o;
        return id == that.id && Objects.equals(word, that.word) && Objects.equals(useYn, that.useYn) && Objects.equals(remark, that.remark) && Objects.equals(createtime, that.createtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, word, useYn, remark, createtime);
    }
}
