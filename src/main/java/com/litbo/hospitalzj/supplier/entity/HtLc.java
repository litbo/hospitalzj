package com.litbo.hospitalzj.supplier.entity;

import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * 合同流程
 */

public class HtLc {
    private Integer lcId;

    private Integer htId;

    private String htCldz;

    private Date htClsj;

    public Integer getLcId() {
        return lcId;
    }

    public void setLcId(Integer lcId) {
        this.lcId = lcId;
    }

    public Integer getHtId() {
        return htId;
    }

    public void setHtId(Integer htId) {
        this.htId = htId;
    }

    public String getHtCldz() {
        return htCldz;
    }

    public void setHtCldz(String htCldz) {
        this.htCldz = htCldz;
    }

    public Date getHtClsj() {
        return htClsj;
    }

    public void setHtClsj(Date htClsj) {
        this.htClsj = htClsj;
    }
}

