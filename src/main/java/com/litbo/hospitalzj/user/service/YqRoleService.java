package com.litbo.hospitalzj.user.service;

import com.litbo.hospitalzj.entity.YqRole;

/**
 * 用户角色
 */
public interface YqRoleService {
    void insertYqRole(YqRole yqRole);
    YqRole getYqRole(Integer id);
    void deleteInfo(Integer id);
}
