package com.test.AopTest;

import com.learn.spring.AOP.AspectTarget;
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
public class AopTest extends BaseTest {

    public AopTest(){
        super("spring-aop.xml");
    }

    @Test
    public void testAspectTarget() throws Exception {
        AspectTarget aspectTarget = super.getBean("aspectTarget");
        aspectTarget.targetMethod("target");
    }

    /**
     * AOP在通知中拿到目标方法的参数
     * @throws Exception
     */
    @Test
    public void testAspectTarget02() throws Exception {
        AspectTarget aspectTarget = super.getBean("aspectTarget");
        aspectTarget.init("target",123);
    }


}
