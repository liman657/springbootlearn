package com.learn.chapter06.mybatis.service.impl;

import com.learn.chapter06.dao.mybatis.mapper.MyBatisUserDao;
import com.learn.chapter06.mybatis.POJO.User;
import com.learn.chapter06.mybatis.service.MyBatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Service("myBatisUserService")
public class MyBatisUserServiceImpl implements MyBatisUserService {

    @Autowired
    private MyBatisUserDao myBatisUserDao;

    @Override
    public User getUser(Long id) {
        return myBatisUserDao.getUser(id);
    }
}
