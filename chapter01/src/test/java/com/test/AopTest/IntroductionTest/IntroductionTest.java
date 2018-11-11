package com.test.AopTest.IntroductionTest;

import com.learn.spring.AOP.AspectTarget;
import com.learn.spring.AOP.Introductions.Fit;
import com.test.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 *
 * AOP introduction的实例测试类
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class IntroductionTest extends BaseTest {
    public IntroductionTest(){
        super("spring-aop-introduction.xml");
    }

    @Test
    public void testAspectIntroduction() throws Exception {
        Fit fit = (Fit) super.getBean("aspectTarget");
        fit.filter();
    }
}
