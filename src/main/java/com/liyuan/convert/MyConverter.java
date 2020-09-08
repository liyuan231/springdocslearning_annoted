package com.liyuan.convert;

import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.stereotype.Component;

/**
 * PropertyEditor详见editor包
 * PropertyEditor的替代类，用于类型转换
 */

public class MyConverter implements Converter<String,Integer> {
    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }
}
