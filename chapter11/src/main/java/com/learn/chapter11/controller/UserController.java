package com.learn.chapter11.controller;

import com.learn.chapter11.domain.User;
import com.learn.chapter11.enumeration.SexEnum;
import com.learn.chapter11.service.UserService;
import com.learn.chapter11.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/restful")
    public String index(){
        return "restful";
    }

    //将VO对象转换的po
    private User changeToPo(UserVo userVo){
        User user = new User();
        user.setSex(SexEnum.getSexEnum(userVo.getSexCode()));
        user.setUserName(userVo.getUserName());
        user.setId(userVo.getId());
        user.setNote(userVo.getNote());
        return user;
    }

    // 转换PO变为VO
    private UserVo changeToVo(User user) {
        UserVo userVo = new UserVo();
        userVo.setId(user.getId());
        userVo.setUserName(user.getUserName());
        userVo.setSexCode(user.getSex().getCode());
        userVo.setSexName(user.getSex().getName());
        userVo.setNote(user.getNote());
        return userVo;
    }
}