package com.learn.chapter11.controller;

import com.learn.chapter11.domain.User;
import com.learn.chapter11.enumeration.SexEnum;
import com.learn.chapter11.vo.UserVo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment: 使用restTemplate请求后端
 */
public class RestTemplateController {

    public static void main(String[] args) {
        System.out.println(getUser(1L));
        System.out.println(findUser("liman","test",1,1));
        UserVo user=new UserVo();
        user.setId(1L);
        user.setNote("test");
        user.setSexCode(0);
        user.setUserName("liman");

        System.out.println(insertUser(user));
    }

    public static UserVo getUser(Long id){
        RestTemplate restTemplate = new RestTemplate();
        UserVo user = restTemplate.getForObject("http://localhost:8080/user/{id}", UserVo.class, id);
        return user;
    }

    /**
     * 多参数的get请求
     * @param userName
     * @param note
     * @param start
     * @param limit
     * @return
     */
    public static List<UserVo> findUser(String userName, String note, int start, int limit){
        RestTemplate restTemplate = new RestTemplate();
        Map<String,Object> params = new HashMap<>();
        params.put("userName",userName);
        params.put("note",note);
        params.put("start",start);
        params.put("limit",limit);
        String url = "http://localhost:8080/users/{userName}/{note}/{start}/{limit}";
        ResponseEntity<List> responseEntity = restTemplate.getForEntity(url,List.class,params);
        List<UserVo> userVos = responseEntity.getBody();
        return userVos;
    }

    /**
     * 新增用户
     * @param newUserVo
     * @return
     */
    public static User insertUser(UserVo newUserVo){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        //创建请求实体
        HttpEntity<UserVo> request = new HttpEntity<>(newUserVo,headers);
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.postForObject("http://localhost:8080/user",request,User.class);
        System.out.println(user.toString());
        return user;
    }

}
