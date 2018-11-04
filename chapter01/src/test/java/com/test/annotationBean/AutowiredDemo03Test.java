package com.test.annotationBean;

import com.learn.spring.annotationBean.autowired.AutoWiredDemo03;
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
public class AutowiredDemo03Test extends BaseTest {

    public AutowiredDemo03Test(){
        super("spring-annotationBean.xml");
    }

    @Test
    public void testPrint(){
        AutoWiredDemo03 autowiredDemo03 = super.getBean("autoWiredDemo03");
        autowiredDemo03.print();
    }

}
