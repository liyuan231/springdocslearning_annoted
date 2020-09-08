package com.liyuan.controller;

import com.liyuan.model.SimpleMovieLister;
import com.liyuan.model.SysUser;
import com.liyuan.validate.Customer;
import com.liyuan.validate.SysUserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    SimpleMovieLister simpleMovieLister;

    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }



    @GetMapping("/showBeans")
    public void showBeans() {
        System.out.println("Controllr!!!=====================");
        System.out.println(applicationContext.toString());
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        simpleMovieLister.show();
    }

    @Autowired
    SysUserValidator sysUserValidator;
    @GetMapping("/query")
    public String testValidate(SysUser user) {
        DataBinder dataBinder = new DataBinder(user);
        dataBinder.setValidator(sysUserValidator);
        dataBinder.validate();
        BindingResult result = dataBinder.getBindingResult();
        List<ObjectError> allErrors = result.getAllErrors();
        StringBuilder stringBuilder = new StringBuilder();
        for (ObjectError allError : allErrors) {
            stringBuilder.append(allError).append("\n");
        }
        return stringBuilder.toString();
    }
}
