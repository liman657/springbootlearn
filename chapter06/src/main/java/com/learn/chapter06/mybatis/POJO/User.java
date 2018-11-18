package com.learn.chapter06.mybatis.POJO;

import com.learn.chapter06.Enum.SexEnum;
import org.apache.ibatis.type.Alias;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * 测试mybatis的实体
 */
@Alias(value="user")
public class User {

    private Long id = null;
    private SexEnum sex = null;
    private String userName = null;
    private String note = null;

    public User(){}

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
