package com.test.beanScope;

import com.learn.spring.Bean.scope.BeanScope;
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
public class BeanScopeTest extends BaseTest {

    public BeanScopeTest(){
        super("classpath:spring-beanscope.xml");
    }

    @Test
    public void BeanScopeTest(){
        BeanScope beanScope1 = super.getBean("beanScope");

        BeanScope beanScope2 = super.getBean("beanScope");
        System.out.println(beanScope1.hashCode()+":"+beanScope2.hashCode());
    }

}
