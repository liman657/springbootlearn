package com.learn.spring.annotationBean.generic;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class GenIntegerStore implements GenStore<Integer> {
    @Override
    public void printStore() {
        System.out.println("this is integer store");
    }
}
