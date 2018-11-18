package com.learn.chapter06.dao.mybatis.mapper;

import com.learn.chapter06.mybatis.POJO.User;
import org.springframework.stereotype.Repository;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Repository
public interface MyBatisUserDao {

    public User getUser(Long id);

}
