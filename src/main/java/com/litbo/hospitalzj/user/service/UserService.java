package com.litbo.hospitalzj.user.service;

import com.litbo.hospitalzj.user.bean.SUser;
import com.litbo.hospitalzj.user.vo.SelectURVo;
import com.litbo.hospitalzj.user.vo.SelectUserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    SUser getUserByUsername(String username);

    Integer setUser(String userId);

    Integer updatePwd(String userId, String userPwd);

    Integer delete(String userId);

    void insertUser(@Param("userId") String userId, @Param("userName") String userName, @Param("userPwd") String userPwd, @Param("bz") String bz);

    List<SelectURVo> findAll();
}
