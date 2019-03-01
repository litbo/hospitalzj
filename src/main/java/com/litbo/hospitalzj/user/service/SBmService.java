package com.litbo.hospitalzj.user.service;

import com.litbo.hospitalzj.user.bean.SBm;

import java.util.List;

/**
 * 部门表业务层接口
 */
public interface SBmService {
    SBm select(String bmId);
    List<SBm> selectAll();
    void delete(String bmId);
    void update(SBm sbm);
    void insert(SBm sBm);
}
