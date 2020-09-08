package com.liyuan.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@ComponentScan(value = {"com.liyuan"}, excludeFilters =
        {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})})
//@ImportResource("classpath:spring.xml")
@PropertySource("classpath:application.properties")
@Configuration
public class RootConfig {
//        @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }


}