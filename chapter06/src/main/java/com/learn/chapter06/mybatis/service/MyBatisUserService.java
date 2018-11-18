package com.learn.chapter06.mybatis.service;

import com.learn.chapter06.mybatis.POJO.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public interface MyBatisUserService{
    public User getUser(Long id);

    public int insertUser(User user);
}
