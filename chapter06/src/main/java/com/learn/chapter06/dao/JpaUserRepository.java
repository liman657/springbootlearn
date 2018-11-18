package com.learn.chapter06.dao;

import com.learn.chapter06.JPA.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment: 测试JPA的命名查询
 */
public interface JpaUserRepository extends JpaRepository<User,Long> {

    List<User> findByUserNameLike(String userName);

    User getUserById(Long id);

    List<User> findByUserNameLikeOrNoteLike(String userName,String note);

}
