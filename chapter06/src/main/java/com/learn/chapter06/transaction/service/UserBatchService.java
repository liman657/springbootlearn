package com.learn.chapter06.transaction.service;

import com.learn.chapter06.mybatis.POJO.User;

import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public interface UserBatchService {
    public int insertUsers(List<User> userList);
}
