package com.learn.chapter10.controller;

import com.learn.chapter10.domain.User;
import com.learn.chapter10.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Controller
@RequestMapping("/data")
public class DataModelController {

    @Autowired
    private UserService userService;

    @GetMapping("/model")
    public String userModel(Long id,Model model){
        User user = userService.getUser(id);
        model.addAttribute("user",user);
        //这里返回字符串，在spring mvc中会自动创建ModelAndView且绑定名称
        return "data/user";
    }

    @GetMapping("/modelMap")
    public ModelAndView userModelMap(Long id , ModelMap modelMap){
        User user = userService.getUser(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("data/user");
        modelMap.put("user",user);
        return mv;
    }

    @GetMapping("/mav")
    public ModelAndView userModelAndView(Long id,ModelAndView mv){
        User user = userService.getUser(id);
        mv.addObject("user",user);
        mv.setViewName("data/user");
        return mv;
    }



}
