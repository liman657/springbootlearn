package com.test.annotationBean;

import com.learn.spring.annotationBean.qualify.QualifyDemo;
import com.test.BaseTest;
import jdk.nashorn.internal.ir.BaseNode;
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
public class QualifyDemoTest extends BaseTest {

    public QualifyDemoTest(){
        super("spring-annotationBean.xml");
    }

    @Test
    public void testQualify(){
        QualifyDemo qualifyDemo = super.getBean("qualifyDemo");
        qualifyDemo.qualifyTest();
    }

}
