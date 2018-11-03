package com.test.helloworld;

import com.learn.spring.SpringDemo;
import com.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class HelloworldTest extends BaseTest {

    @Autowired
    private SpringDemo springDemo;

    @Test
    public void testHelloworld(){
        springDemo.test();
    }



}
