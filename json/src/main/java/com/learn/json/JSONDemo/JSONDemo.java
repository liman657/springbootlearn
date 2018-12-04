package com.learn.json.JSONDemo;

import com.learn.json.JSONDemo.bean.Person;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:三种构建json的方式
 * 1、直接构建
 * 2、map构建
 * 3、bean构建
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

    /**
     * 直接手动构建JSONObject
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

    /**
     * 利用map构建json对象
     */
    private static void createJsonObjectByMap(){
        Map<String,Object> person = new HashMap<String,Object>();
        Object nullObj = null;
        person.put("name","王小二");
        person.put("age",25);
        person.put("birthday","1990-01-01");
        person.put("school","蓝翔");
        person.put("major",new String[]{"理发","挖掘机"});
        person.put("has_girlFirend",true);
        person.put("car",nullObj);
        person.put("house",true);
        person.put("comment","这是一个注释");

        JSONObject personJson = new JSONObject(person);
        System.out.println(personJson.toString());

    }

    private static void createJsonObjectFromBean(){
        Person person = new Person();
        person.setName("王小二");
        person.setAge(25.2);
        person.setBirthday("1990-01-01");
        person.setSchool("蓝翔");
        person.setMajor(new String[]{"理发","挖掘机"});
        person.setHasGirlFriend(true);
        person.setHouse(true);
        person.setCar(null);
        person.setComment("这是一个注释");

        JSONObject jsonObjectPerson = new JSONObject(person);
        System.out.println(jsonObjectPerson.toString());
    }

    public static void main(String[] args) {
        JSONObjectDemo();
        createJsonObjectByMap();
        createJsonObjectFromBean();
    }
}
