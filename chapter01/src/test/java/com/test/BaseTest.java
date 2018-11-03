package com.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {

    private ClassPathXmlApplicationContext context;

    private String springXmlPath;

    public BaseTest(){

    }

    public BaseTest (String springXmlPath){
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before(){
        if(StringUtils.isEmpty(springXmlPath)){
            springXmlPath = "classpath*:spring-*.xml";
        }
        try{
            context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
            context.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @After
    public void after(){
        context.destroy();
    }

    protected <T extends Object> T getBean(String beanId){
        try {
            return (T) context.getBean(beanId);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    protected <T extends Object> T getBean(Class<T> clazz){
        try{
            return context.getBean(clazz);
        }catch (BeansException e){
            e.printStackTrace();
            return null;
        }
    }

}
