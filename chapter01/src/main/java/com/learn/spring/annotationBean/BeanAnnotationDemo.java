package com.learn.spring.annotationBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Component("beanAnnotationDemo")
@Scope("prototype")
public class BeanAnnotationDemo {

    public void annotationBean(){
        System.out.println("this is annotation bean");
    }

}
