package com.learn.springbootAop.service.impl;

import com.learn.springbootAop.domain.User;
import com.learn.springbootAop.service.UserService;
import org.springframework.stereotype.Service;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void printUser() {
        User somebody = new User();
        somebody.setComment("这就是个测试");
        somebody.setPassword("clm25701x");
        somebody.setUsername("liman");
        System.out.println(somebody.toString());
    }
}
