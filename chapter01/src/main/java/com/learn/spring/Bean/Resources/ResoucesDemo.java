package com.learn.spring.Bean.Resources;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * 常用于读取相关的resource配置文件
 */
public class ResoucesDemo implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource() throws IOException {
        Resource resource=applicationContext.getResource("classpath:config.txt");

        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
