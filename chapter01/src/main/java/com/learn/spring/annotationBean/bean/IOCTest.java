package com.learn.spring.annotationBean.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class IOCTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StoreConfig.class);
        StringStore stringStore = applicationContext.getBean(StringStore.class);
        stringStore.printStore();
    }

}
