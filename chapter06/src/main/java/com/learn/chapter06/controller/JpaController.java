package com.learn.chapter06.controller;

import com.learn.chapter06.JPA.POJO.User;
import com.learn.chapter06.dao.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Controller
@RequestMapping("/jpa")
public class JpaController {

    @Autowired
    private JpaUserRepository jpaUserRepository = null;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(Long id){
        User user = jpaUserRepository.findById(id).get();
        return user;
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(Long id){
        User user = jpaUserRepository.getUserById(id);
        return user;
    }

    @RequestMapping("/findByUserNameLike")
    @ResponseBody
    public List<User> findByUserNameLike(String userName){
        List<User> userList = jpaUserRepository.findByUserNameLike("%"+userName+"%");
        return userList;
    }

    @RequestMapping("/findByUserNameLikeOrNotelike")
    @ResponseBody
    public List<User> findByUserNameLikeOrNotelike(String userName,String note){
        String userNameLike = "%"+userName+"%";
        String noteLike = "%"+note+"%";
        List<User> userList = jpaUserRepository.findByUserNameLikeOrNoteLike(userNameLike,noteLike);
        return userList;
    }
}