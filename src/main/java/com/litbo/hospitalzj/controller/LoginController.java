package com.litbo.hospitalzj.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.litbo.hospitalzj.controller.ex.UserYanzhengException;
import com.litbo.hospitalzj.service.exception.PasswordNotMatchException;
import com.litbo.hospitalzj.util.ResponseResult;
import com.litbo.hospitalzj.vo.LoginVo;

import javax.validation.Valid;

@Controller
@RequestMapping("/hospital")
public class LoginController extends BaseController {

    @RequestMapping("/")
    public String tologin(){
        return "login";
    }
    @RequestMapping("/tomain")
    public String tomain(){
        return "index";
    }


    @RequestMapping("/submit")
    @ResponseBody
    public ResponseResult<Void> submit(@Valid LoginVo loginVo, BindingResult bindingResult){
        if(bindingResult.hasErrors()) {
        	throw new UserYanzhengException("用户名验证异常");
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(loginVo.getUserName(),loginVo.getUserPwd());


        try {
            subject.login(token);
            //把用户名存入session
            Session session =  subject.getSession();
            session.setAttribute("username",loginVo.getUserName());
            return new ResponseResult<Void>(SUCCESS);
        }catch (Exception e){
        	throw new PasswordNotMatchException("用户名密码错误");
        }
    }
}


