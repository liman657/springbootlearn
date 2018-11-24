package com.test.annotationBean;

import com.learn.spring.Bean.lifecycle.LifeCycleDemo;
import com.learn.spring.annotationBean.bean.lifecycle.Person;
import com.test.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * 测试bean的生命周期
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class LifeCycleTest extends BaseTest {

    public LifeCycleTest(){
        super("spring-lifecycle.xml");
    }

    @Test
    public void testLifeCycle(){
        Person person = (Person)super.getBean("person");
//        LifeCycleDemo lifeCycleDemo = (LifeCycleDemo)super.getBean("lifeCycleDemo");
        person.fun();
    }
}