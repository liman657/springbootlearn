package com.learn.chapter10.controller;

import com.learn.chapter10.domain.User;
import com.learn.chapter10.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
}
