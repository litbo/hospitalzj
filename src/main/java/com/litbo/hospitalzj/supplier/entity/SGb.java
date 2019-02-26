package com.litbo.hospitalzj.supplier.entity;

/**
 * 国别的实体
 */
public class SGb {
    private String gbId;

    private String gb;

    public String getGbId() {
        return gbId;
    }

    public void setGbId(String gbId) {
        this.gbId = gbId == null ? null : gbId.trim();
    }

    public String getGb() {
        return gb;
    }

    public void setGb(String gb) {
        this.gb = gb == null ? null : gb.trim();
    }
}