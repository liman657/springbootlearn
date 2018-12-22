package com.learn.chapter10.controller;

import com.learn.chapter10.domain.User;
import com.learn.chapter10.service.UserService;
import com.learn.chapter10.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private PdfView pdfView;

    @Autowired
    private UserService userService;

    //绑定逻辑验证器
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setValidator(new UserValidator());
        //定义日期格式，不再需要@DateTimeFormat注解
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));
    }

    @GetMapping("/userValidator")
    @ResponseBody
    public Map<String,Object> validator(@Valid User user, Errors errors,Date date){
        Map<String,Object> map =new HashMap<>();
        map.put("user",user);
        map.put("date",date);

        if(errors.hasErrors()){
            List<ObjectError> oes = errors.getAllErrors();
            for(ObjectError oe:oes){
                if(oe instanceof FieldError){
                    FieldError fe = (FieldError)oe;
                    map.put(fe.getField(),fe.getDefaultMessage());
                }else{
                    map.put(oe.getObjectName(),oe.getDefaultMessage());
                }
            }
        }
        return map;
    }

    @GetMapping("/export/pdf")
    public ModelAndView exportPdf(){
        ModelAndView mv = new ModelAndView();
        mv.setView(pdfView);
        return mv;
    }

    //测试重定向

    @GetMapping("/show")
    public String showUser(Long id,Model model){
        User user = userService.getUser(id);
        model.addAttribute("user",user);
        return "data/user";
    }

    //使用字符串指定跳转
    @GetMapping("/redirect1")
    public String redirect1(String username,String note){
        User user = userService.getUser(1L);
        return "redirect:/user/show?id=1";
    }

    @GetMapping("/redirect2")
    public ModelAndView redirect2(String username,String note){
        User user = userService.getUser(1L);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/user/show?id=1");
        return mv;
    }

    @GetMapping("/header/page")
    public String headerPage(){
        return "header";
    }

    @PostMapping("/header/user")
    @ResponseBody
    public User headerUser(@RequestHeader("id") Long id){
        System.out.println(id);
        return userService.getUser(1L);
    }
}