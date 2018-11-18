package com.learn.chapter06.JdbcTemplate;

import com.learn.chapter06.pojo.User;

import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * 定义用户服务接口
 */
public interface JdbcTmplUserService {

    public User getUser(Long id);

    public List<User> findUsers(String userName, String note);

    public int insertUser(User user);

    public int updateUser(User user);

    public int deleteUser(Long id);

}
