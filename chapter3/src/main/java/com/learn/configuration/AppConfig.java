package com.learn.configuration;

import com.learn.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Configuration
public class AppConfig {

    @Bean(name="user")
    public User initUser(){
        User user = new User();
        user.setId(1L);
        user.setUsername("liman");
        user.setNote("noteOne");
        return user;
    }

}
