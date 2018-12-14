package com.learn.chapter10.convert;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.learn.chapter10.domain.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * author:liman
 * createtime:2018/12/13
 * mobile:15528212893
 * email:657271181@qq.com
 */
@Component
public class StringToUserConverter implements Converter<String,User> {
    @Override
    public User convert(String userStr) {
        User user = new User();
        String[] str = userStr.split("_");
        Long id = Long.parseLong(str[0]);
        String username = str[1];
        String note = str[2];
        user.setId(id);
        user.setNote(note);
        user.setUsername(username);
//        System.out.println(user.toString());
        return user;
    }

}
