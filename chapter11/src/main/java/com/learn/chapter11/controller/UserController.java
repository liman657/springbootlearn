package com.learn.chapter11.controller;

import com.learn.chapter11.domain.User;
import com.learn.chapter11.enumeration.SexEnum;
import com.learn.chapter11.service.UserService;
import com.learn.chapter11.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String index() {
        System.out.println("test index");
        return "restful";
    }

    @PostMapping("/user")
    @ResponseBody
    public User insertUser(@RequestBody UserVo userVo) {
        User user = this.changeToPo(userVo);
        System.out.println(user.toString());
        return user;
    }

    @GetMapping(value = "/user/{id}")
    @ResponseBody
    public UserVo getUser(@PathVariable("id") Long id) {
        User user = new User();
        user.setNote("just test");
        user.setId(id);
        user.setUserName("liman");
        user.setSex(SexEnum.MALE);
        return changeToVo(user);
    }

    @GetMapping(value = "/users/{userName}/{note}/{start}/{limit}")
    @ResponseBody
    public List<UserVo> findUsers(
            @PathVariable("userName") String userName,
            @PathVariable("note") String note,
            @PathVariable("start") int start,
            @PathVariable("limit") int limit) {
        System.out.println(userName+":"+note+":"+start+":"+limit);
        List<User> userList = userService.findUsers(userName, note, start, limit);
        return this.changeToVoes(userList);
    }

    @PutMapping("/user/{id}")
    @ResponseBody
    public User updateUser(@PathVariable("id") Long id,@RequestBody UserVo userVo){
        User user = this.changeToPo(userVo);
        user.setId(1L);
        userService.updateUser(user);
        return user;
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