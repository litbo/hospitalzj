package com.litbo.hospitalzj.supplier.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gouser")
public class GoSuppController {
    @RequestMapping("/login")
    public String qxfp(){
        return "Userlogin";
    }

}
