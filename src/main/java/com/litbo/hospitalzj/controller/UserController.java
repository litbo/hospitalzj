package com.litbo.hospitalzj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.litbo.hospitalzj.entity.SUser;
import com.litbo.hospitalzj.service.UserService;
import com.litbo.hospitalzj.util.ResponseResult;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    UserService userService;
    @RequestMapping("/setUser")
    public ResponseResult<SUser> setUser(SUser user){
    		SUser data=userService.setUser(user);
    		return new ResponseResult<SUser>(SUCCESS,data);
    	}
    @RequestMapping("/updatePwd")
    public ResponseResult<SUser> updatePwd(Integer userId,String userPwd){
    	userService.updatePwd(userId, userPwd);
    	return new ResponseResult<SUser>(SUCCESS);
    }

}
