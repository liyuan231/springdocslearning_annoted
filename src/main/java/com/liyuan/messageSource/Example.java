package com.liyuan.messageSource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Locale;

@Component
public class Example {
    @Resource
    private MessageSource messageSource;

    public void execute() {
        String message = this.messageSource.getMessage("argument.required",
                new Object[]{"Liyuan"}, "Default", Locale.CHINA);
        System.out.println(message);
    }

}
