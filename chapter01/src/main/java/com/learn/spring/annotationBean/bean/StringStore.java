package com.learn.spring.annotationBean.bean;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class StringStore implements Store {

    public void initMethod(){
        System.out.println("this is stringStore init method");
    }

    public void destroyMethod(){
        System.out.println("this is stringStore destroy method");
    }

    @Override
    public void printStore() {
        System.out.println("this is string store");
    }
}
