package com.litbo.hospitalzj.service;

import com.litbo.hospitalzj.entity.SUser;

public interface UserService {
	/**
	 * 通过用户名查找用户
	 * @param username
	 * @return
	 */
    SUser getUserByUsername(String username);
    /**
     * 插入用户
     * @param userId
     * @return
     */
    SUser setUser(SUser user);
    /**
     * 更改密码
     * @param userId
     * @param userPwd
     * @return
     */
    Integer updatePwd(Integer userId, String userPwd);
}
