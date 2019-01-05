package com.learn.generic;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment: 通配符实例
 */
public class WildCardDemo {
    public static void main(String[] args) {
//        Info<String> info = new Info<String>();
//        info.setVar("just test demo");
//        fun(info);

        Info<Integer> infoInteger = new Info<Integer>();
        infoInteger.setVar(12);
        fun(infoInteger);

        Info<Float> infoFloat = new Info<Float>();
        infoFloat.setVar(20.5f);
        fun(infoFloat);
    }

    //?可以理解为泛型的泛型
//    public static void fun(Info<?> temp){
//        System.out.println("内容："+temp);
//    }

    public static void fun(Info<? extends Number> temp){
        System.out.println("内容:"+temp);
    }
}

class Info<T>{
    private T var;

    public void setVar(T var){
        this.var = var;
    }

    public T getVar() {
        return this.var;
    }

    @Override
    public String toString() {
        return "Info{" +
                "var=" + var +
                '}';
    }
}