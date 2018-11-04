package com.learn.spring.annotationBean.propertiesAnno;

import org.springframework.stereotype.Component;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * 直接利用注解读取配置文件
 */
@Component
public class MyPropertyManager {


    public MyPropertyManager(String url,String username,String password){
        System.out.println(url+":"+username+":"+password);
    }

}
