package com.learn.spring.annotationBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Service("autoWiredDemo")
public class AutowiredDemo {

    @Autowired
    private BeanAnnotationDemo beanAnnotationDemo;

    public void testAutowiredDemo(){
        beanAnnotationDemo.annotationBean();
    }

}
