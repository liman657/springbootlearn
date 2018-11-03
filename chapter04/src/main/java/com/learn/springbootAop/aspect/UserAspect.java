package com.learn.springbootAop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Aspect
public class UserAspect {

    @Pointcut("execution(* com.learn.springbootAop.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before(){
        System.out.println("开始进行判空校验！");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("方法执行之后的操作");
    }

}
