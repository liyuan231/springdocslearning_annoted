package com.liyuan.editor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class Something {
    private Integer age;
    private String name;


    @Autowired
    DefaultListableBeanFactory beanFactory;

    public void test(){
//        beanFactory.registerCustomEditor();
        System.out.println(beanFactory);
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
