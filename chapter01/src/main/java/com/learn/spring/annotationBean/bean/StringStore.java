package com.learn.spring.annotationBean.bean;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class StringStore implements Store {
    @Override
    public void printStore() {
        System.out.println("this is string store");
    }
}
