package com.litbo.hospitalzj.user.controller;

import com.litbo.hospitalzj.user.service.RightService;
import com.litbo.hospitalzj.user.util.Result;
import com.litbo.hospitalzj.user.vo.SetRightVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/right")
public class RightController {

    @Autowired
    private RightService rightService;

    //为角色设置权限
    @GetMapping("/setRights")
    public Result setRights(@RequestBody SetRightVo setRightVo){
        List<String> rightIds = setRightVo.getRightIds();
        //先判断数据库中是否已经为该角色设置权限
        //如果是先删除再增加
        if (rightService.countByRoleId(setRightVo.getRoleId()) > 0) {
            rightService.deletaByRoleId(setRightVo.getRoleId());
        }
        //循环添加
        for (String rightId : rightIds) {
            if (rightService.setRights(rightId, setRightVo.getRoleId()) < 0) {
                return Result.error();
            }
        }
        return Result.success();
    }
    //根据角色Id查权限
}
