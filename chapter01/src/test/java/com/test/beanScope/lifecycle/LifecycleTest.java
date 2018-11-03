package com.test.beanScope.lifecycle;

import com.learn.spring.Bean.lifecycle.LifeCycleDemo;
import com.test.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class LifecycleTest extends BaseTest {

    public LifecycleTest(){
        super("classpath:spring-lifecycle.xml");
    }

    @Test
    public void lifeCycleTest(){
        LifeCycleDemo lifeCycleDemo = super.getBean("lifeCycleDemo");
    }

}
