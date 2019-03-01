package com.litbo.hospitalzj.user.service;

import com.github.pagehelper.PageInfo;

import com.litbo.hospitalzj.user.bean.SRole;
import com.litbo.hospitalzj.user.vo.SelectUserVo;

import java.util.List;


public interface RoleService {

    List<SRole> getRoleByUsername(String username);

    Integer addRole(SRole role);

    Integer setRole(String userId, String roleId);

    PageInfo listUser(int pageNum, int pageSize);

    PageInfo listUserByX(SelectUserVo selectUserVo, int pageNum, int pageSize);

    List<SRole> listRoles();
}
