package com.liyuan.messageSource;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import javax.annotation.PostConstruct;

@Configuration
public class MyMessageSource {
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.addBasenames("i18n");
        messageSource.setDefaultEncoding("utf-8");
        return messageSource;
    }

    @PostConstruct
    public void init() {
        System.out.println("MyMessageSource is being initialized!");
    }
}
