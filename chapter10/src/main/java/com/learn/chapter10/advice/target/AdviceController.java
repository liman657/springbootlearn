package com.learn.chapter10.advice.target;

import org.apache.tools.ant.util.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Controller
@RequestMapping("/advice")
public class AdviceController {

    @GetMapping("/test")
    public String test(Date date, ModelMap modelMap) throws Exception {
        System.out.println("从已经初始化的数据模型中获取数据"+modelMap.get("project_name"));
        System.out.println(DateUtils.format(date,"yyyy-MM-dd"));
        throw new RuntimeException("出现异常，跳转到控制器异常处理增强逻辑中");
    }
}