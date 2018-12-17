package com.learn.chapter10.validator;


import com.learn.chapter10.domain.User;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment: 自定义的数据逻辑验证器
 */
public class UserValidator implements Validator {

    //判断验证的目标对象
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(User.class);
    }

    //验证逻辑
    @Override
    public void validate(Object target, Errors errors) {
        if(target == null){
            errors.rejectValue("",null,"用户不能为空");
        }
        User user= (User)target;
        if(StringUtils.isEmpty(user.getUsername())||!"liman".equals(user.getUsername())){
            errors.rejectValue("username",null,"用户名只能为liman，没有办法他就是这么牛逼");
        }
    }
}
