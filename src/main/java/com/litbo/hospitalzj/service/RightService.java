package com.litbo.hospitalzj.service;

import java.util.List;

import com.litbo.hospitalzj.entity.SRight;


public interface RightService {
	/**
	 * 通过角色名得到用户权限
	 * @param roleName
	 * @return
	 */
    List<SRight> getRightsByRolename(String roleName);

    /**
     * 设置权限
     * @param rightId
     * @param roleId
     * @return
     */
    Integer setRights(String rightId, String roleId);

    /**
     * 通过角色id查询权限数量
     * @param roleId
     * @return
     */
    Integer countByRoleId(String roleId);
    /**
     * 通过角色id删除用户权限
     * @param roleId
     */
    void deletaByRoleId(String roleId);
}
