package com.litbo.hospitalzj.user.service;


import com.litbo.hospitalzj.user.bean.SRight;

import java.util.List;


public interface RightService {

    List<SRight> getRightsByRolename(String roleName);


    Integer setRights(String rightId, String roleId);


    Integer countByRoleId(String roleId);

    void deletaByRoleId(String roleId);
}
