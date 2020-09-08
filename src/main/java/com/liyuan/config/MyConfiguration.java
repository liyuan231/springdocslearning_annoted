package com.liyuan.config;

import com.liyuan.myqualifier.MyQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class MyConfiguration {

    @Bean
    @Resource
    public Store<String> stringStore() {
        return new Store<>();
    }

    @Bean
    public Store<Integer> integerStore() {
        return new Store<>();
    }

    @Autowired
    private Store<String> stringStore;

    @Autowired
    private Store<Integer> integerStore;

    @Override
    public String toString() {
        return "MyConfiguration{" +
                "stringStore=" + stringStore +
                ", integerStore=" + integerStore +
                '}';
    }
}
