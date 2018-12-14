//package com.learn.chapter10.convert;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.convert.support.GenericConversionService;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
//import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
//
//import javax.annotation.PostConstruct;
//
///**
// * author:liman
// * createtime:2018/12/14
// * mobile:15528212893
// * email:657271181@qq.com
// */
//@Configuration
//public class SpringDataConvert {
//
//    @Autowired
//    private RequestMappingHandlerAdapter requestMappingHandlerAdapter;
//
//    @PostConstruct
//    public void addConversionConfig(){
//        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) requestMappingHandlerAdapter.getWebBindingInitializer();
//        if(initializer.getConversionService()!=null){
//            GenericConversionService genericConversionService = (GenericConversionService) initializer.getConversionService();
//            genericConversionService.addConverter(new StringToUserConverter());
//        }
//    }
//
//}
