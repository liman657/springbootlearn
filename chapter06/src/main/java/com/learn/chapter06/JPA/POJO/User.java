package com.learn.chapter06.JPA.POJO;

import com.learn.chapter06.Enum.SexEnum;

import javax.persistence.*;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Entity(name="user")
@Table(name = "t_user")
public class User {
    // 标明主键
    @Id
    // 主键策略，递增
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    // 定义属性和表的映射关系
    @Column(name = "user_name")
    private String userName = null;

    private String note = null;

    // 定义转换器
    @Convert(converter = SexConverter.class)
    private SexEnum sex = null;

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

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
