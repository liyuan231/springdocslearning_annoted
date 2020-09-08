package com.liyuan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class CustomerPreferenceDao {
    @Autowired
    MessageSource messageSource;

    @Override
    public String toString() {
        return "CustomerPreferenceDao{" +
                "messageSource=" + messageSource +
                '}';
    }
}
