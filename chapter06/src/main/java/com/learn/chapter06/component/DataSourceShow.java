package com.learn.chapter06.component;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment: 这个只是获取数据源的类型信息，简单测试一下
 *
 */
@Component
public class DataSourceShow implements ApplicationContextAware {

    private ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        DataSource datasource = applicationContext.getBean(DataSource.class);
        System.out.println("获得的数据源的类型为："+datasource.getClass().getSimpleName());
    }
}
