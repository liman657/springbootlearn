package com.learn.spring.AOP;

import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.annotation.Target;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class AspectDemo {

    public void beforeMethod(){
        System.out.println("this is before advice");
    }

    public void afterReturning(){
        System.out.println("this after returning method");
    }

    public void afterThrowing(){
        System.out.println("this is after throwing method");
    }

    public void after(){
        System.out.println("this is after method");
    }

    public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("this is around advice before");
        joinPoint.proceed();
        System.out.println("this is around advice after");
    }

    public void aroundInit(ProceedingJoinPoint joinPoint,String bizName,int times) throws Throwable {
        System.out.println(bizName+" "+times);
        System.out.println("this is around advice before");
        joinPoint.proceed();
        System.out.println("this is around advice after");
    }

}
