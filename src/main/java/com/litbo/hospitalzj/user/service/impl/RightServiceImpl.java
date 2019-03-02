package com.litbo.hospitalzj.user.service.impl;


import com.litbo.hospitalzj.user.bean.SRight;
import com.litbo.hospitalzj.user.dao.RightDao;
import com.litbo.hospitalzj.user.service.RightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RightServiceImpl implements RightService {

    @Autowired
    private RightDao rightDao;
    @Override
    public List<SRight> getRightsByRolename(String roleName) {
        return rightDao.getRightsByRolename(roleName);
    }

    @Override
    public Integer setRights(String rightId, String roleId) {
            return rightDao.addRights(rightId,roleId);
    }


    @Override
    public Integer countByRoleId(String roleId) {
        return rightDao.countRole(roleId);
    }

    @Override
    public void deletaByRoleId(String roleId) {
        rightDao.deletaByRoleId(roleId);
    }


}
