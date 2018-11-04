package com.learn.spring.annotationBean.autowired;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Component
@Order(2)
public class AutowiredImplOne implements autowiredInterface{
    @Override
    public void testAutowiredArray() {
        System.out.println("this is autowiredImplone");
    }
}
