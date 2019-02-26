package com.litbo.hospitalzj.user.service.impl;

import com.litbo.hospitalzj.user.bean.SUser;
import com.litbo.hospitalzj.user.dao.UserDao;
import com.litbo.hospitalzj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
   private UserDao userDao;

    @Override
    public SUser getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }

    @Override
    public Integer setUser(String userId) {

        SUser u =new SUser();
        u.setUserId(userId);
        u.setUserName(userId);
        u.setUserPwd(userId);
        //修改emp表中标记值   未写
        return userDao.addUser(u);
    }

    @Override
    public Integer updatePwd(String userId, String userPwd) {

        return userDao.updatePwd(userId,userPwd);
    }
}
