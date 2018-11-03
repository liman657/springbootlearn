package com.learn.spring.Bean.autowirting;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class AutoWritingService {

    private AutoWritingDao autoWritingDao;

    public void setAutoWritingDao(AutoWritingDao autoWritingDao) {
        this.autoWritingDao = autoWritingDao;
    }

    public void saySomething(){
        autoWritingDao.saySomething();
    }

}
