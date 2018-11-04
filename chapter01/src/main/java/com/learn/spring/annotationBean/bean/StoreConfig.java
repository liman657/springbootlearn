package com.learn.spring.annotationBean.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Configuration
public class StoreConfig {

    /**
     * 如果不指定名称，默认是方法名作为bean的id
     * @return
     */
    @Bean(name="stringStore",initMethod = "initMethod",destroyMethod = "destroyMethod")
    public Store getStringStore(){
        return new StringStore();
    }

}
