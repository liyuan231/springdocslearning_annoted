package com.liyuan.validation;

import org.springframework.context.annotation.Bean;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.util.List;

@RestController
public class TestController {
    @PostMapping("/saveUser")
    public String saveUser(@RequestBody @Valid UserDto userDto,
                           BindingResult bindingResult) {
        List<ObjectError> allErrors = bindingResult.getAllErrors();
        for (ObjectError allError : allErrors) {
            System.out.println(allError);
        }
        System.out.println(userDto.toString());
        return userDto.toString();
    }
//    @Bean
//    public Validator validator(){
//
//    }
}
