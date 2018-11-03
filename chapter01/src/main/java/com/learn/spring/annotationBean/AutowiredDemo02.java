package com.learn.spring.annotationBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * @Autowired 可以注入一些众所周知的类型，BeanFactory和ApplicationContext等
 *
 * @Autowired 是由BeanPostProcessor处理的，所以不能在自己的BeanPostProcessor或BeanFactoryPostProcessor类型应用这些注解
 *
 * 数组集合类的注入
 */
@Service("autowiredDemo02")
public class AutowiredDemo02 {

    //数组
    @Autowired
    private List<BeanAnnotationDemo> demos;

    public void listDemos(){
        if(null != demos){
            for(BeanAnnotationDemo demo:demos){
                System.out.println(demos.size());
                System.out.println(demo.getClass().getSimpleName());
            }
        }
    }
}
