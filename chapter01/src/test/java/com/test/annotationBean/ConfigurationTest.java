package com.test.annotationBean;

import com.learn.spring.annotationBean.bean.StringStore;
import com.learn.spring.annotationBean.qualify.QualifyDemo;
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
public class ConfigurationTest extends BaseTest {

    public ConfigurationTest(){
        super("spring-annotationBean.xml");
    }

    @Test
    public void testConfiguration(){
        StringStore stringStore = super.getBean("stringStore");
        stringStore.printStore();
    }

}
