package com.litbo.hospitalzj.user.vo;

import java.util.List;

public class SetPmVo {

    private String eqPmId;

    private List<String>  eqIds;

    public String getEqPmId() {
        return eqPmId;
    }

    public void setEqPmId(String eqPmId) {
        this.eqPmId = eqPmId;
    }

    public List<String> getEqIds() {
        return eqIds;
    }

    public void setEqIds(List<String> eqIds) {
        this.eqIds = eqIds;
    }
}
