package com.learn.chapter06.JPA.POJO;

import com.learn.chapter06.Enum.SexEnum;

import javax.persistence.AttributeConverter;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class SexConverter implements AttributeConverter<SexEnum, Integer> {

    // 将枚举转换为数据库列
    @Override
    public Integer convertToDatabaseColumn(SexEnum sex) {
        return sex.getId();
    }

    // 将数据库列转换为枚举
    @Override
    public SexEnum convertToEntityAttribute(Integer id) {
        return SexEnum.getEnumById(id);
    }
}