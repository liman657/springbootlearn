package com.learn.generic.GenericObject;

import javax.sound.sampled.Line;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment: 返回泛型实例
 */
public class GenericObjectDemo {

    public static void main(String[] args) {

        InfoObject<Long> testResult = fun(123L);
        System.out.println(testResult);

    }

    //返回值前声明泛型，返回一个泛型
    public static <T extends Number> InfoObject<T> fun(T param){
        InfoObject<T> temp = new InfoObject<T>();
        temp.setVar(param);
        return temp;
    }

}

class InfoObject<T extends Number>{
    private T var;

    public T getVar(){
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "InfoObject{" +
                "var=" + var +
                '}';
    }
}
