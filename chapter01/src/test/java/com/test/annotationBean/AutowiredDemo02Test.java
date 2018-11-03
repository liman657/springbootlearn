package com.test.annotationBean;

import com.learn.spring.annotationBean.AutowiredDemo;
import com.learn.spring.annotationBean.AutowiredDemo02;
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
public class AutowiredDemo02Test extends BaseTest {

    public AutowiredDemo02Test(){
        super("spring-annotationBean.xml");
    }

    @Test
    public void testAutowiredDemo02(){
        AutowiredDemo02 autowiredDemo = super.getBean("autowiredDemo02");
        autowiredDemo.listDemos();
    }


}
