package com.learn.chapter10;

import com.learn.chapter10.interceptor.InterceptorOne;
import com.learn.chapter10.interceptor.InterceptorThree;
import com.learn.chapter10.interceptor.InterceptorTwo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages = "com.learn.chapter10")
public class Chapter10Application implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(Chapter10Application.class, args);
    }

    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration01 = registry.addInterceptor(new InterceptorOne());
        interceptorRegistration01.addPathPatterns("/interceptor/*");

        InterceptorRegistration interceptorRegistration02 = registry.addInterceptor(new InterceptorTwo());
        interceptorRegistration02.addPathPatterns("/interceptor/*");

        InterceptorRegistration interceptorRegistration03 = registry.addInterceptor(new InterceptorThree());
        interceptorRegistration03.addPathPatterns("/interceptor/*");
    }
}