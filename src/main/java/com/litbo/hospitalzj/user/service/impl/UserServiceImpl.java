package com.litbo.hospitalzj.user.service.impl;

import com.litbo.hospitalzj.user.bean.SUser;
import com.litbo.hospitalzj.user.dao.UserDao;
import com.litbo.hospitalzj.user.service.UserService;
import com.litbo.hospitalzj.user.vo.SelectURVo;
import com.litbo.hospitalzj.user.vo.SelectUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return userDao.addUser(u);
    }

    @Override
    public Integer updatePwd(String userId, String userPwd) {
        return userDao.updatePwd(userId,userPwd);
    }

    @Override
    public Integer delete(String userId) {
        return userDao.delete(userId);
    }

    @Override
    public void insertUser(String userId, String userName, String userPwd, String bz) {
        userDao.insertUser(userId,userName,userPwd,bz);
    }

    @Override
    public List<SelectURVo> findAll() {
        return userDao.findAll();
    }
}
