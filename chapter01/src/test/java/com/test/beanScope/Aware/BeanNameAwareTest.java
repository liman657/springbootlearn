package com.test.beanScope.Aware;

import com.learn.spring.Bean.aware.BeanNameAwareDemo;
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
public class BeanNameAwareTest extends BaseTest {

    public BeanNameAwareTest(){
        super("classpath:spring-aware.xml");
    }

    @Test
    public void beanAwareTest(){
        BeanNameAwareDemo beanNameAwareDemo = super.getBean("beanNameAwareDemo");
    }
}
