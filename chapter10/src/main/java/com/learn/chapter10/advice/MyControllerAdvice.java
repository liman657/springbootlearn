package com.learn.chapter10.advice;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@ControllerAdvice(basePackages = {"com.learn.chapter10.advice.target.*"}, annotations = Controller.class)
public class MyControllerAdvice {

    //绑定格式化，增加参数验证，和参数转换规则，在控制器方法执行前执行
    @InitBinder
    public void initDataBinder(WebDataBinder webDataBinder){
        CustomDateEditor  dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),false);
        webDataBinder.registerCustomEditor(Date.class,dateEditor);
    }

    //在执行控制器之前执行，可以初始化出具模型
    @ModelAttribute
    public void projectModel(Model model){
        model.addAttribute("project_name","chapter10");
    }

    //出现异常的时候，会执行
    @ExceptionHandler(value=Exception.class)
    public String exception(Model model,Exception ex){
        //给数据模型增加异常消息
        model.addAttribute("exception_message",ex.getMessage());
        System.out.println(ex.getMessage());
        //返回异常视图
        return "exception";
    }
}