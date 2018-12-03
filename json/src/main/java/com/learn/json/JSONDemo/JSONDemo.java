package com.learn.json.JSONDemo;

import org.json.JSONObject;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class JSONDemo {

    /**
     * {
     * 	"name":"王小二",
     * 	"age":"25",
     * 	"birthday":"1992-01-01",
     * 	"school":"蓝翔",
     * 	"major":["理发","挖掘机"],
     * 	"has_girlFriend":true,
     * 	"car":null,
     * 	"house":true,
     * 	"comment":"这是一个注释"
     * }
     */

    private static void JSONObjectDemo(){
        Object nullObj = null;
        JSONObject person = new JSONObject();
        person.put("name","王小二");
        person.put("age",25);
        person.put("birthday","1990-01-01");
        person.put("school","蓝翔");
        person.put("major",new String[]{"理发","挖掘机"});
        person.put("has_girlFirend",true);
        person.put("car",nullObj);
        person.put("house",true);
        person.put("comment","这是一个注释");

        System.out.println(person.toString());
    }

    public static void main(String[] args) {
        JSONObjectDemo();
    }
}
