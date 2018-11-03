package com.test.beanScope.resourcesDemo;

import com.learn.spring.Bean.Resources.ResoucesDemo;
import com.test.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ResoucesTest extends BaseTest {

    public ResoucesTest(){
        super("classpath:spring-resource.xml");
    }

    @Test
    public void testResource(){
        ResoucesDemo resoucesDemo = super.getBean("resoucesDemo");
        try {
            resoucesDemo.resource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
