package com.learn.spring.AOP;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class AspectTarget {

    public String targetMethod(String targetMsg) throws Exception{
        System.out.println(targetMsg);
//        throw new RuntimeException("test Exception");
        return targetMsg;
    }

    public void init(String bizName,int times){
        System.out.println("AspectBiz init:"+bizName+":"+times);
    }

}
