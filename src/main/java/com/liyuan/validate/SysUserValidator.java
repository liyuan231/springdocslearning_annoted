package com.liyuan.validate;

import com.liyuan.model.SysUser;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class SysUserValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return SysUser.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"name","empty.name");
        SysUser sysUser = (SysUser) target;
        if(sysUser.getAge()<0){
            errors.rejectValue("age","negative age!");
        }else if (sysUser.getAge()>110){
            errors.rejectValue("age","too.darn.old");
        }
    }
}
