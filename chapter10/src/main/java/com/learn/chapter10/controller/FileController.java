package com.learn.chapter10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * 文件上传Controller
 *
 */
@Controller
@RequestMapping("/file")
public class FileController {

    @GetMapping("/upload/page")
    public String uploadPage(){
        return "/file/upload";
    }

    //使用request对象作为文件传递参数
    @PostMapping("/upload/request")
    @ResponseBody
    public Map<String,Object> uploadRequest(HttpServletRequest request){
        boolean flag = false;
        MultipartHttpServletRequest mreq = null;
        if(request instanceof MultipartHttpServletRequest){
            mreq = (MultipartHttpServletRequest)request;
        }else{
            return dealResultMap(false,"上传失败!");
        }

        //从file参数中获取文件数据
        MultipartFile multipartFile = mreq.getFile("file");
        String fileName = multipartFile.getOriginalFilename();
        File file = new File(fileName);

        try{
            multipartFile.transferTo(file);
        }catch (Exception e){
            e.printStackTrace();
            return dealResultMap(false,"上传失败!");
        }
        return dealResultMap(true,"上传成功!");

    }

    @PostMapping("/upload/multipart")
    @ResponseBody
    public Map<String,Object> uploadMultipartFile(MultipartFile file){
        String fileName = file.getOriginalFilename();
        File dest = new File(fileName);
        try{
            file.transferTo(dest);
        }catch (Exception e){
            e.printStackTrace();
            return dealResultMap(false,"上传失败!");
        }
        return dealResultMap(true,"上传成功!");
    }

    @PostMapping("/upload/part")
    @ResponseBody
    public Map<String,Object> uploadPart(Part file){
        String fileName = file.getSubmittedFileName();
        try{
            file.write(fileName);
        }catch (Exception e){
            e.printStackTrace();
            return dealResultMap(false,"上传失败!");
        }
        return dealResultMap(true,"上传成功!");
    }

    private Map<String,Object> dealResultMap(boolean success,String msg){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("success",success);
        result.put("msg",msg);
        return result;
    }

}