package com.litbo.hospitalzj.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/go")
public class GoController {

    @RequestMapping("/qxfp")
    public String qxfp(){
        return "admin/home/powers";
    }

    @RequestMapping("/zdgl")
    public String  zdgl(){
        return "admin/home/dictionary";
    }
    @RequestMapping("/ryfpsz")
    public String  ryfpsz(){
        return "admin/home/personal";
    }
    @RequestMapping("/jcyqfp")
    public String jcyqfp(){
        return "admin/home/check_fixing";
    }
}
