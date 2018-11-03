package com.learn.spring.injection;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class InjectionServiceImpl implements InjectionService{

    private InjectionDao injectionDao;

    public InjectionServiceImpl(InjectionDao injectionDao){
        this.injectionDao = injectionDao;
    }

    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    @Override
    public void saveData(String data) {
        injectionDao.save(data);
    }
}
