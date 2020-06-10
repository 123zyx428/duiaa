package com.zhaike.controller;

import com.zhaike.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/num")
    public ModelAndView one(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("num");
        modelAndView.addObject("nums",100);
        return modelAndView;
    }
    @RequestMapping("/login")
    public String login(String email,String password){
        return userService.login(email,password)!=null ? "登录成功":"登录失败";
    }
}
