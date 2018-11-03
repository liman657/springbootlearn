package com.test.beanScope.Aware;

import com.learn.spring.Bean.aware.ApplicationContextAwareDemo;
import com.learn.spring.Bean.lifecycle.LifeCycleDemo;
import com.test.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ApplicationContextAwareTest extends BaseTest {

    public ApplicationContextAwareTest(){
        super("classpath:spring-aware.xml");
    }

    @Test
    public void beanAwareTest(){
        ApplicationContextAwareDemo applicationContextAwareDemo = super.getBean("applicationContextAwareDemo");
        System.out.println("applicationContextAwareDemo:"+applicationContextAwareDemo.hashCode());
    }

}
