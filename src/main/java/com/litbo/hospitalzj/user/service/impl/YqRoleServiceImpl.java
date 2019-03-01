package com.litbo.hospitalzj.user.service.impl;

import com.litbo.hospitalzj.entity.YqRole;
import com.litbo.hospitalzj.user.dao.YqRoleDao;
import com.litbo.hospitalzj.user.service.YqRoleService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 仪器角色
 */
public class YqRoleServiceImpl implements YqRoleService {
    @Autowired
    private  YqRoleDao yqRoleDao;
    @Override
    public void insertYqRole(YqRole yqRole) {
        yqRoleDao.insertYqRole(yqRole);
    }

    @Override
    public YqRole getYqRole(Integer id) {
        return null;
    }

    @Override
    public void deleteInfo(Integer id) {

    }
}
