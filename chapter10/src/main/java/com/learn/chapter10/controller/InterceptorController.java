package com.learn.chapter10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:拦截器controller
 */
@Controller
@RequestMapping("/interceptor")
public class InterceptorController {

    @GetMapping("/start")
    public String start(){
        System.out.println("执行处理器逻辑");
        return "/welcome";
    }

}
