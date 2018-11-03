package com.learn.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Component("springDemo")
public class SpringDemo implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean {

    public void test(){
        System.out.println("this is spring hello world");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("["+this.getClass().getSimpleName()+"]"+"调用BeanFactoryAware的setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("["+this.getClass().getSimpleName()+"]"+"调用BeanNameAware的setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("["+this.getClass().getSimpleName()+"]"+"调用DisposableBean的destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("["+this.getClass().getSimpleName()+"]"+"调用InitializingBean的afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("["+this.getClass().getSimpleName()+"]"+"调用ApplicationContextAware的setApplicationContext");
    }
}
