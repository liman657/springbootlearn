package com.learn.spring.Bean.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class BeanNameAwareDemo implements BeanNameAware {
    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameDemo:"+s);
    }
}
