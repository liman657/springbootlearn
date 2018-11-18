package com.learn.chapter06.controller;

import com.learn.chapter06.mybatis.POJO.User;
import com.learn.chapter06.mybatis.service.MyBatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * 测试mybatis的controller
 */
@Controller
@RequestMapping("/mybatis")
public class MyBatisController {

    @Autowired
    private MyBatisUserService myBatisUserService;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(Long id){
        return myBatisUserService.getUser(id);
    }

}
