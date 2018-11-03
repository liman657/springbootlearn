package com.test.annotationBean;

import com.learn.spring.Bean.Resources.ResoucesDemo;
import com.learn.spring.annotationBean.BeanAnnotationDemo;
import com.test.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanAnnotationDemoTest extends BaseTest {

    public BeanAnnotationDemoTest(){
        super("classpath:spring-annotationBean.xml");
    }

    @Test
    public void testBeanAnnotationDemo(){
        BeanAnnotationDemo beanAnnotationDemo01=super.getBean("beanAnnotationDemo");
        BeanAnnotationDemo beanAnnotationDemo02=super.getBean("beanAnnotationDemo");

        System.out.println(beanAnnotationDemo01.hashCode());
        System.out.println(beanAnnotationDemo02.hashCode());
        beanAnnotationDemo01.annotationBean();
    }

}
