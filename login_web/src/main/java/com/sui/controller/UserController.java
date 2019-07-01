package com.sui.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sui.entity.User;
import com.sui.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    IUserService userserivce;

    @RequestMapping("/register")
    public String register(User user){
        userserivce.register(user);
        return "userregister";
    }

}
