package com.learn.spring.annotationBean.generic;

import com.learn.spring.annotationBean.bean.StringStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Configuration
public class GenStoreConfig {

    @Autowired
    private GenStore<String> storeOne;

    @Autowired
    private GenStore<Integer> storeTwo;

    @Bean
    public GenStringStore stringStore(){
        return new GenStringStore();
    }

    @Bean
    public GenIntegerStore integerStore(){
        return new GenIntegerStore();
    }

    @Bean("testStore")
    public TestStore testGenInfo(){
        storeOne.printStore();
        storeTwo.printStore();
        return new TestStore();
    }
}
