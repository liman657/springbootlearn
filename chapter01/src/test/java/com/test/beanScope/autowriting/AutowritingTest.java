package com.test.beanScope.autowriting;

import com.learn.spring.Bean.autowirting.AutoWritingService;
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
public class AutowritingTest extends BaseTest {

    public AutowritingTest(){
        super("classpath:spring-autowriting.xml");
    }

    @Test
    public void testAutowriting(){
        AutoWritingService autoWritingService=super.getBean("autoWritingService");
        autoWritingService.saySomething();
    }
}
