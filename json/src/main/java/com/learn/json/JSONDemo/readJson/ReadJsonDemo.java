package com.learn.json.JSONDemo.readJson;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * 获取json数据，并解析json数据
 */
public class ReadJsonDemo {

    public static void main(String[] args) throws IOException {
        //读取文件
        File file = new File(ReadJsonDemo.class.getResource("/person.json").getFile());
        String content = FileUtils.readFileToString(file);

        //根据字符串转换成JSONObject
        JSONObject jsonObject = new JSONObject(content);

        //JSON数据的判空操作
        if(!jsonObject.isNull("nickName")){
            System.out.println("昵称是："+jsonObject.get("nickName"));
        }
        System.out.println("姓名是："+jsonObject.getString("name"));
        System.out.println("年龄是："+jsonObject.getDouble("age"));
        System.out.println("是否有媳妇："+jsonObject.getBoolean("has_girlFriend"));

        //jsonArray的转换需要注意
        JSONArray majorArray = jsonObject.getJSONArray("major");
        for(int i =0;i<majorArray.length();i++){
            System.out.println(majorArray.get(i));
        }
    }
}
