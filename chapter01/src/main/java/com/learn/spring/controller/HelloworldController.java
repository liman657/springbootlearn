package com.learn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Controller
public class HelloworldController {

    @RequestMapping(value="/test",method = RequestMethod.POST)
    public String testHelloworld(){
        return "index";
    }

}
