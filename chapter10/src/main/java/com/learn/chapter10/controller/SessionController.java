package com.learn.chapter10.controller;

import com.learn.chapter10.domain.User;
import com.learn.chapter10.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Controller
//@SessionAttributes注解 指定数据模型或数据类型，这些数据会报错到session中
@SessionAttributes(names={"user"},types=Long.class)
@RequestMapping("/session")
public class SessionController {

    @Autowired
    private UserService userService;

    @GetMapping("/session")
    public String toSession(){
        return "session/session";
    }

    //@SessionAttribute注解从HTTPSession中获取数据，填充控制器方法参数
    @GetMapping("/test")
    public String test(@SessionAttribute("id") Long id,Model model){
        model.addAttribute("id_new",id);
        User user = userService.getUser(1L);
        model.addAttribute("user",user);
        return "session/test";
    }
}