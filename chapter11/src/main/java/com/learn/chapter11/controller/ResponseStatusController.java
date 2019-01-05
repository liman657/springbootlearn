package com.learn.chapter11.controller;

import com.learn.chapter11.domain.User;
import com.learn.chapter11.enumeration.SexEnum;
import com.learn.chapter11.service.UserService;
import com.learn.chapter11.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Controller
@RequestMapping("/status")
public class ResponseStatusController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String toIndex(){
        return "headerStatus";
    }

    @PostMapping("/successHeader")
    public ResponseEntity<UserVo> insertUserEntity(@RequestBody UserVo userVo){
        User user = this.changeToPo(userVo);
        userService.insertUser(user);
        UserVo result = this.changeToVo(user);
        HttpHeaders headers = new HttpHeaders();
        String success = "true";
        headers.add("success",success);
        return new ResponseEntity<UserVo>(result,headers, HttpStatus.CREATED);
    }

    @PostMapping("/successHeader2")
    //直接在注解上加入返回成功的状态码
    @ResponseStatus(HttpStatus.CREATED)
    public UserVo insertUserSuccess(@RequestBody UserVo userVo){
        User user = this.changeToPo(userVo);
        userService.insertUser(user);
        UserVo result = this.changeToVo(user);
        return result;
    }


    //将VO对象转换的po
    private User changeToPo(UserVo userVo) {
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

    // 将PO列表转换为VO列表
    private List<UserVo> changeToVoes(List<User> poList) {
        List<UserVo> voList = new ArrayList<>();
        for (User user : poList) {
            UserVo userVo = changeToVo(user);
            voList.add(userVo);
        }
        return voList;
    }
}