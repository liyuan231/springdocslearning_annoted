package com.liyuan.validate;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class AddressValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Address.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Address address = (Address) target;
        if (!StringUtils.hasText(address.getCountry())) {
            errors.rejectValue("country", "country should not be empty!");
        } else if (!StringUtils.hasText(address.getProvince())) {
            errors.rejectValue("province", "province should not be empty!");
        } else if (!StringUtils.hasText(address.getCity())) {
            errors.rejectValue("city", "city should not be empty!");
        }

    }
}
