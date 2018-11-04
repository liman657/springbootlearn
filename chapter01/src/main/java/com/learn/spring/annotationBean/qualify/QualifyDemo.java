package com.learn.spring.annotationBean.qualify;

import com.learn.spring.annotationBean.autowired.AutowiredInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Component
public class QualifyDemo {

    /**
     * Qualify注解需要和Autowired注解配合使用
     */
    @Autowired
    @Qualifier("autowiredImplTwo")
    private AutowiredInterface autowiredInterface;

    public void qualifyTest(){
        autowiredInterface.testAutowiredArray();
    }

}
