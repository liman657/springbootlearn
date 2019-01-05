package com.learn.generic;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:普通泛型
 */
public class OrdinaryGeneric {

    public static void main(String[] args) {
        Point<String> point = new Point<String>();
        point.setVar("just test generic");
        System.out.println(point.getVar().length());

        Notepad<String,Integer> notepad = new Notepad<String, Integer>();
        notepad.setKey("age");
        notepad.setValue(18);
        System.out.println(notepad.getKey()+":"+notepad.getValue());
    }

}

class Point<T>{
    private T var;
    public T getVar(){
        return var;
    }
    public void setVar(T var){
        this.var = var;
    }
}

//这里设置两个泛型
class Notepad<K,V>{
    private K key;
    private V value;

    public K getKey(){
        return this.key;
    }

    public V getValue(){
        return this.value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}