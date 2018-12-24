package com.learn.chapter11.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.learn.chapter11.domain.User;
import com.learn.chapter11.enumeration.SexEnum;
import com.learn.chapter11.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(Long id){
        User user = new User();
        user.setId(id);
        user.setUserName("liman");
        user.setNote("test");
        user.setSex(SexEnum.MALE);
        return user;
    }

    @Override
    public List<User> findUsers(String userName, String note, int start, int limit) {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(Long.valueOf(i));
            user.setUserName("test" + i);
            user.setSex(SexEnum.MALE);
            userList.add(user);
        }
        return userList;
    }

    @Override
    public int updateUser(User user) {
        System.out.println("update user ......");
        return 0;
    }

    @Override
    public int updateUserName(Long id, String userName) {
        System.out.println("update username" + id + userName);
        return 0;
    }

    @Override
    public int deleteUser(Long id) {
        System.out.println("delete user" + id);
        return 0;
    }

    @Override
    public User insertUser(User user) {
        System.out.println("insert user" + user.getUserName());
        return user;
    }
}