package com.learn.chapter09.controller;

import com.learn.chapter09.domain.User;
import com.learn.chapter09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/table")
    public ModelAndView tableUser(){
        System.out.println("进入tableUser");
        userService.initUserList();
        List<User> userList = userService.getUserList();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/table");
        modelAndView.addObject("userList",userList);
        return modelAndView;
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<User> listUser(){
        System.out.println("进入listUser");
        userService.initUserList();
        return userService.getUserList();
    }

}
