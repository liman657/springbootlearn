package com.learn.spring.annotationBean.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Component
public class AutoWiredDemo03 {

    /**
     * 注入的数组，可以配置order注解使用
     */
    @Autowired
    public List<autowiredInterface> autointerfaceList;

    /**
     * autowired注入map属性，默认的key是类名首字母小写，value是指定对象
     */
    @Autowired
    public Map<String,autowiredInterface> autowiredMaps;

    public void print(){
        if(null != autointerfaceList){
            System.out.println(autointerfaceList.size());

            for(autowiredInterface entry:autointerfaceList){
                entry.testAutowiredArray();
            }
        }

        if(null!= autowiredMaps){
            System.out.println(autowiredMaps.size());
            for(Map.Entry<String,autowiredInterface> entry:autowiredMaps.entrySet()){
                System.out.println(entry.getKey());
                entry.getValue().testAutowiredArray();
            }
        }
    }

}
