package com.litbo.hospitalzj.user.service;

import com.litbo.hospitalzj.user.bean.SUser;

public interface UserService {

    SUser getUserByUsername(String username);

    Integer setUser(String userId);

    Integer updatePwd(String userId, String userPwd);
}
