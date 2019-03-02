package com.litbo.hospitalzj.user.service;

import com.litbo.hospitalzj.user.bean.EqNdjh;

import java.util.List;

/**
 * 年度计划表
 */
public interface EqNdjhService {
    void insert(EqNdjh eqNdjh);
    EqNdjh update(EqNdjh eqNdjh);
    EqNdjh select(Integer jcjhId);
    void delete(Integer jcjhId);
    List<EqNdjh> selectAll();

}
