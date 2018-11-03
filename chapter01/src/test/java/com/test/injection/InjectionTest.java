package com.test.injection;

import com.learn.spring.injection.InjectionService;
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
public class InjectionTest extends BaseTest {

    public InjectionTest(){
        super("classpath:spring-injection.xml");
    }

    /**
     * 测试属性注入，set方式注入
     */
    @Test
    public void testSetInjection(){
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.saveData("set injection test data");
    }

    @Test
    public void testConsInjection(){
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.saveData("cons injection test data");
    }

}
