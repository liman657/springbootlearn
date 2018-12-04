package com.learn.json.JSONDemo.GSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.learn.json.JSONDemo.bean.Person;
import com.learn.json.JSONDemo.bean.PersonWithDate;
import com.learn.json.JSONDemo.bean.PersonWithList;
import com.learn.json.JSONDemo.readJson.ReadJsonDemo;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * 使用GSON对json字符串进行解析
 */
public class GSONDeserializeDemo {
    public static void main(String[] args) throws IOException {
        //读取文件
        File file = new File(ReadJsonDemo.class.getResource("/person.json").getFile());
        String content = FileUtils.readFileToString(file);

        //相比JSONObject来说，这个可以解析成指定的对象，而JSONObject不行
        Gson gson = new Gson();
        Person person = gson.fromJson(content, Person.class);
        System.out.println(person.toString());

        //日期格式的转换
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gsonDate = gsonBuilder.setDateFormat("yyyy-MM-dd").create();
        PersonWithDate personWithDate = gsonDate.fromJson(content, PersonWithDate.class);
        System.out.println(personWithDate.getBirthday().toLocaleString());

        //GSON可以将json中的数组和Java集合进行无缝对接
        Gson gsonCollection = gsonBuilder.create();
        PersonWithList personWithList = gsonCollection.fromJson(content, PersonWithList.class);
        System.out.println(personWithList.getMajor());
        System.out.println(personWithList.getMajor().getClass().getSimpleName());
    }
}