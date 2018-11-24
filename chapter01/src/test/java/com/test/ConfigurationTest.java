package com.test;

import com.learn.spring.annotationBean.bean.StoreConfig;
import com.learn.spring.annotationBean.bean.StringStore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class ConfigurationTest extends BaseTest{

    public ConfigurationTest(){
        super("spring-annotationBean.xml");
    }

    @Test
    public void testConfiguration(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StoreConfig.class);
        StringStore stringStore=(StringStore)applicationContext.getBean("stringStore");
        stringStore.printStore();
    }

}
