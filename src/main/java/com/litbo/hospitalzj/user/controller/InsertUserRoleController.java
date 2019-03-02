package com.litbo.hospitalzj.user.controller;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.user.bean.InsertUserRole;
import com.litbo.hospitalzj.user.service.RoleService;
import com.litbo.hospitalzj.user.service.UserService;
import com.litbo.hospitalzj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userrole")
public class InsertUserRoleController extends BaseController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @RequestMapping("/insertUserRole")
    public ResponseResult<Void> insertUser( InsertUserRole insertUserRole){
       userService.insertUser(insertUserRole.getUserId(),insertUserRole.getUserName(),insertUserRole.getUserPwd(),insertUserRole.getBz());
       roleService.setRole(insertUserRole.getUserId(),insertUserRole.getRoleId());
       return new ResponseResult<Void>(SUCCESS);
    }
}
