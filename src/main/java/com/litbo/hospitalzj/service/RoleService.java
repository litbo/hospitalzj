package com.litbo.hospitalzj.service;

import com.github.pagehelper.PageInfo;
import com.litbo.hospitalzj.entity.SRole;
import com.litbo.hospitalzj.vo.SelectUserVo;

import org.springframework.stereotype.Service;

import java.util.List;


public interface RoleService {

    List<SRole> getRoleByUsername(String username);

    Integer addRole(SRole role);

    Integer setRole(String userId, String roleId);

    PageInfo listUser(int pageNum, int pageSize);

    PageInfo listUserByX(SelectUserVo selectUserVo, int pageNum, int pageSize);

    List<SRole> listRoles();
}
