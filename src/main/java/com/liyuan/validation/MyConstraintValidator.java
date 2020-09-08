package com.liyuan.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyConstraintValidator implements ConstraintValidator<StringStartsWithLiyuan, String> {
    public void initialize(StringStartsWithLiyuan constraint) {
        System.out.println("MyConstraintValidator is being inited!");
    }

    public boolean isValid(String obj, ConstraintValidatorContext context) {
        if(obj==null||!obj.startsWith("Liyuan")){
            return false;
        }
        return true;
    }
}
