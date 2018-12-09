package com.learn.chapter09.service;

import com.learn.chapter09.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Service("userService")
public class UserService {

    private static List<User> userList = new ArrayList<User>();

    public void initUserList(){
        for(int i =0;i<10;i++){
            User user = new User();
            user.setId(Long.valueOf(i));
            user.setNote("test"+i);
            user.setSex("男");
            user.setUsername("liman_"+i);

            userList.add(user);
        }
    }

    public List<User> getUserList(){
        return userList;
    }

}
