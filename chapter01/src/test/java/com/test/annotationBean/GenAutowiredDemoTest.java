package com.test.annotationBean;

import com.learn.spring.annotationBean.bean.StringStore;
import com.learn.spring.annotationBean.generic.TestStore;
import com.test.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * 基于泛型的注入实例
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class GenAutowiredDemoTest extends BaseTest {

    public GenAutowiredDemoTest(){
        super("spring-annotationBean.xml");
    }

    @Test
    public void testGenStore(){
        TestStore stringStore=super.getBean("testStore");
    }

}
