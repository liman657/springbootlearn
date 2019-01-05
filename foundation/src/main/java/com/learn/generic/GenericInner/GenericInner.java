package com.learn.generic.GenericInner;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:嵌套泛型的使用
 */
public class GenericInner {

    public static void main(String[] args) {
        Demo<Info<String,Integer>> demo = null;
        Info<String,Integer> info = null;

        info = new Info<String, Integer>("age",30);
        demo = new Demo<Info<String, Integer>>(info);
        System.out.println("内容一："+demo.getInfo().getVar());
        System.out.println("内容二："+demo.getInfo().getValue());
    }
}

class Info<T,V>{
    private T var;
    private V value;

    public Info(T var, V value) {
        this.var = var;
        this.value = value;
    }

    public V getValue() {

        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public T getVar() {

        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}

class Demo<S>{
    private S info;

    public Demo(S info) {
        this.info = info;
    }

    public S getInfo() {
        return info;
    }

    public void setInfo(S info) {
        this.info = info;
    }
}