package com.test.helloworld;

import com.learn.spring.SpringDemo;
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
public class HelloworldTest extends BaseTest {

    public HelloworldTest(){
        super("classpath*:applicationContext.xml");
    }

    @Test
    public void testHellworld(){
        SpringDemo springDemo = super.getBean("springDemo");
        springDemo.test();
    }



}
