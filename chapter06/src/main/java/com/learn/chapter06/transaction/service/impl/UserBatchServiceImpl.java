package com.learn.chapter06.transaction.service.impl;

import com.learn.chapter06.dao.mybatis.mapper.MyBatisUserDao;
import com.learn.chapter06.mybatis.POJO.User;
import com.learn.chapter06.transaction.service.UserBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Service("userBatchService")
public class UserBatchServiceImpl implements UserBatchService {

    @Autowired
    private MyBatisUserDao myBatisUserDao;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public int insertUsers(List<User> userList) {
        int count = 0;
        for(User user:userList){
            //调用子方法，将使用@Transactional定义的传播行为
            count+=myBatisUserDao.insertUser(user);
        }
        return count;
    }
}
