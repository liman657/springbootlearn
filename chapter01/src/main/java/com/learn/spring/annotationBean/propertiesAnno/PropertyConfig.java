package com.learn.spring.annotationBean.propertiesAnno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 *
 * PropertySource才是用于导入properties文件的注解
 * ImportSource是用于导入xml文件的注解
 */
@Configuration
@PropertySource("classpath:jdbctest.properties")
public class PropertyConfig {

    @Value("${url}")
    private String url;

    //如果配置中直接用username,读取到的是当前电脑的用户名
    @Value("${user.username}")
    private String username;

    @Value("${user.password}")
    private String password;

    @Bean("myPropertyManager")
    public MyPropertyManager getMyPorpertyManager(){
        return new MyPropertyManager(url,username,password);
    }

}
