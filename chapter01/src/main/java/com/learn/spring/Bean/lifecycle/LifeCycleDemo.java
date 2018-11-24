package com.learn.spring.Bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class LifeCycleDemo implements DisposableBean,InitializingBean
{

    //当同时使用了三种方式，这种全局的方式会被覆盖掉
    public void defaultInitMethod(){
        System.out.println("这是全局的构造函数");
    }

    public void defaultDestroyMethod(){
        System.out.println("这是全局的销毁函数");
    }


    public void initSelf(){
        System.out.println("这里是手动实现的init方法，需要在配置中指定");
    }

    public void destorySelf(){
        System.out.println("这是手动实现的destroy方法，需要手动指定");
    }

    /**
     * 实现DisposableBean接口中的指定方法，不需要手动实现指定方法了
     * 这种方式优先级较高
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("这是实现DisposableBean接口中的销毁方法");
    }

    /**
     * 实现InitializingBean接口，实现init方法，这个就不需要指定配置了
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("这是实现InitializingBean接口的初始化方法");
    }
}
