package com.test.annotationBean;

import com.learn.spring.annotationBean.propertiesAnno.MyPropertyManager;
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
public class PropertyConfigTest extends BaseTest {

    public PropertyConfigTest(){
        super("spring-annotationBean.xml");
    }

    @Test
    public void testProperties(){
        MyPropertyManager myPropertyManager = super.getBean("myPropertyManager");
    }

}
