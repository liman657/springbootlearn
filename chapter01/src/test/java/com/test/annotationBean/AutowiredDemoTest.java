package com.test.annotationBean;

import com.learn.spring.annotationBean.AutowiredDemo;
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
public class AutowiredDemoTest extends BaseTest {

    public AutowiredDemoTest(){
        super("spring-annotationBean.xml");
    }

    @Test
    public void testAutowiredDemo(){
        AutowiredDemo autowiredDemo = super.getBean("autoWiredDemo");
        autowiredDemo.testAutowiredDemo();
    }


}
