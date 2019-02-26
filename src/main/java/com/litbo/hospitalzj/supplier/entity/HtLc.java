package com.litbo.hospitalzj.supplier.entity;

import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * 合同流程
 */

public class HtLc {
    private Integer lcId;

    private String htId;

    private String htCldz;

    public Integer getLcId() {
        return lcId;
    }

    public void setLcId(Integer lcId) {
        this.lcId = lcId;
    }

    public String getHtId() {
        return htId;
    }

    public void setHtId(String htId) {
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

    private Date htClsj;



}

