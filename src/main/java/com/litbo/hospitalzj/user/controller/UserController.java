package com.litbo.hospitalzj.user.controller;


import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.user.service.UserService;
import com.litbo.hospitalzj.user.util.Result;
import com.litbo.hospitalzj.user.vo.SelectURVo;
import com.litbo.hospitalzj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    UserService userService;
    @RequestMapping("/all")
    public ResponseResult<List<SelectURVo>> findAll(){
        List<SelectURVo> data= userService.findAll();
        return new ResponseResult<List<SelectURVo>>(SUCCESS,data);
    }
    @RequestMapping("/setUser")
    public Result setUser(String userId){
        if(userService.setUser(userId)>0){
            return Result.success();
        }
        return Result.error();
    }
    @RequestMapping("/updatePwd")
    public Result updatePwd(String userId,String userPwd){
        if(userService.updatePwd(userId,userPwd)>0){
            return  Result.success();
        }
        return Result.error();
    }
    //批量设置为用户
    @PostMapping("/setUsers")
    public Result setUsers(@RequestBody List<String> ids){
        for (String id : ids) {
            if(userService.setUser(id)<0){
                return Result.error(id);
            }
        }
        return Result.success();
    }
    @RequestMapping("/delete")
    public Result delete(String userId){
        if(userService.delete(userId)>0){
            return  Result.success();
        }
        return Result.error();
    }
}
