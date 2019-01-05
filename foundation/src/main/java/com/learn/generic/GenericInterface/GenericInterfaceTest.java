package com.learn.generic.GenericInterface;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class GenericInterfaceTest {

    public static void main(String[] args) {
        InfoImpl<String> infoString = new InfoImpl<String>();
        infoString.setVar("just test demo");
        System.out.println(infoString.getVar());
    }

}

class InfoImpl<T> implements GenericInterface<T> {

    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}