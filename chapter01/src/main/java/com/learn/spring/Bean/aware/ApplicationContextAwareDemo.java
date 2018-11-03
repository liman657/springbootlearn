package com.learn.spring.Bean.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 *  spring 中提供了一些aware结尾的接口，实现了Aware接口的bean在被初始化之后，可以获得相应的资源
 *  通过Aware接口，可以对Spring相应资源进行操作
 *  为对spring进行简单的扩展提供了方便的入口。
 *
 */
public class ApplicationContextAwareDemo implements ApplicationContextAware {

    /**
     * 这是根本就没有显示的去调用她
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("通过实现applicationAware接口，可以获得ApplicationContext对象");
        System.out.println(applicationContext.getApplicationName());
        System.out.println("ApplicationContextDemo信息："+applicationContext.getBean("applicationContextAwareDemo").hashCode());
    }
}
