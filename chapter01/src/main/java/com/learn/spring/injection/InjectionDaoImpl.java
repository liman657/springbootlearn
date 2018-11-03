package com.learn.spring.injection;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class InjectionDaoImpl implements InjectionDao{
    @Override
    public void save(String data) {
        System.out.println("保存数据:"+data);
    }
}
