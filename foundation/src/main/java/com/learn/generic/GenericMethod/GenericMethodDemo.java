package com.learn.generic.GenericMethod;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class GenericMethodDemo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        String str = demo.fun("just test demo");
        int num = demo.fun(30);
        System.out.println(str+":"+num);
    }

}

class Demo{
    public <T> T fun(T t){
        return t;
    }
}
