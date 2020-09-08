package com.liyuan.property;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class MyConverter implements Converter<String,Integer> {

    @Override
    public Integer convert(String source) {
        System.out.println("com.liyuan.property.MyConverter.convert"+source);
        return -1;
    }

}
