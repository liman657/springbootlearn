package com.learn.chapter06.mybatis.POJO;

import com.learn.chapter06.Enum.SexEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * mybatis下的性别类型转换器
 */
@MappedJdbcTypes(JdbcType.INTEGER)
@MappedTypes(value=SexEnum.class)
public class SexTypeHandler extends BaseTypeHandler<SexEnum> {

    /**
     * 设置非空参数
     * @param preparedStatement
     * @param i
     * @param sexEnum
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, SexEnum sexEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,sexEnum.getId());
    }


    @Override
    public SexEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int sex = resultSet.getInt(s);
        if(sex!=1 && sex!=2){
            return null;
        }
        return SexEnum.getEnumById(sex);
    }

    /**
     * 通过下标读取性别
     * @param resultSet
     * @param i
     * @return
     * @throws SQLException
     */
    @Override
    public SexEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int sex = resultSet.getInt(i);
        if(sex!=1 && sex!=2){
            return null;
        }
        return SexEnum.getEnumById(sex);
    }

    /**
     * 通过存储过程读取性别
     * @param callableStatement
     * @param i
     * @return
     * @throws SQLException
     */
    @Override
    public SexEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        int sex = callableStatement.getInt(i);
        if(sex!=1 && sex!=2){
            return null;
        }
        return SexEnum.getEnumById(sex);
    }
}
