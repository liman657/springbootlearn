package com.learn.json.JSONDemo.bean;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class Person {

//    @SerializedName("NAME") //这个注解来自于GSON，可以允许名称自定义
    private String name;
    private String school;
    private boolean hasGirlFriend;
    private double age;
    private Object car;
    private Object house;
    private String[] major;
    private String comment;
    private String birthday;

    private transient String ignore;

    public String getIgnore() {
        return ignore;
    }

    public void setIgnore(String ignore) {
        this.ignore = ignore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isHasGirlFriend() {
        return hasGirlFriend;
    }

    public void setHasGirlFriend(boolean hasGirlFriend) {
        this.hasGirlFriend = hasGirlFriend;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Object getCar() {
        return car;
    }

    public void setCar(Object car) {
        this.car = car;
    }

    public Object getHouse() {
        return house;
    }

    public void setHouse(Object house) {
        this.house = house;
    }

    public String[] getMajor() {
        return major;
    }

    public void setMajor(String[] major) {
        this.major = major;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", hasGirlFriend=" + hasGirlFriend +
                ", age=" + age +
                ", car=" + car +
                ", house=" + house +
                ", major=" + Arrays.toString(major) +
                ", comment='" + comment + '\'' +
                ", birthday='" + birthday + '\'' +
                ", ignore='" + ignore + '\'' +
                '}';
    }
}