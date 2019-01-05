package com.learn.generic.GenericArray;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class GenericArrayDemo {

    public static void main(String[] args) {
        Integer array[] = fun1(1,2,3,4,5,6,7);
        fun2(array);
    }

    public static <T> T[] fun1(T... arg){
        return arg;
    }

    //输出一个泛型数组
    public static <T> void fun2(T param[]){
        System.out.println("接受泛型数组：");
        for(T t:param){
            System.out.print(t+",");
        }
    }

}