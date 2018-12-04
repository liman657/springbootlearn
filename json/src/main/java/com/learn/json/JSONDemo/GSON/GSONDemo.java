package com.learn.json.JSONDemo.GSON;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.learn.json.JSONDemo.bean.Person;

import java.lang.reflect.Field;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * GSON的使用方式
 */
public class GSONDemo {

    public static void main(String[] args) {
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
        person.setIgnore("不要看见我");

        //生成json字符串，这种方式和JSONObject原生差不多
        Gson gson = new Gson();
        System.out.println(gson.toJson(person));

        //在生成json字符串之前，利用builder进行相关操作
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        //构建json数据的时候，可以修改名字
        gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {
            @Override
            public String translateName(Field field) {
                if("name".equals(field.getName()))
                {return "NAME";}
                return field.getName();
            }
        });
        Gson gsonbyBuilder = gsonBuilder.create();
        System.out.println(gsonbyBuilder.toJson(person));
    }

}
