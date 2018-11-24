package com.learn.spring.annotationBean.bean.lifecycle;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class Person {

    private String name;
    private int age;
    private String sex;

    public Person(){
        System.out.println("执行person构造方法");
    }

    public void init(){
        System.out.println("执行person初始化方法");
    }

    public void destory(){
        System.out.println("执行person销毁方法");
    }

    public void fun(){
        System.out.println("正在使用person实例");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
