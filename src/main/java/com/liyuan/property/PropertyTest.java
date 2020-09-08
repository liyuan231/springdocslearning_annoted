package com.liyuan.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

@Component
public class PropertyTest {
    @Value("${liyuan.name}")
    private String name;
    @Value("${liyuan.age}")
    private Integer age;
    @Value("${liyuan.gender}")
    private Boolean gender;

    @Value("${liyuan.school:GDUFS}")
    private String school;

    @Value("#{{'one':1,'two':2}}")
    private Map<String, Integer> map;

    //    @Autowired
    ConversionService conversionService;

    @PostConstruct
    public void init(){
        System.out.println("com.liyuan.property.PropertyTest is being initialized!");
    }
    @Override
    public String toString() {
        return "PropertyTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", school='" + school + '\'' +
                ", map=" + map +
                ", conversionService=" + conversionService +
                '}';
    }
}
