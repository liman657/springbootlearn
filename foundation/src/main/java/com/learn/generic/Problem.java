package com.learn.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * autor:liman
 * comment: 没有泛型的情况
 */
public class Problem {

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("aaa");
        arrayList.add(1L);

        for(int i = 0;i<arrayList.size();i++){
            String element = (String) arrayList.get(i);
            System.out.println("泛型测试,item="+element);
        }
    }

}
