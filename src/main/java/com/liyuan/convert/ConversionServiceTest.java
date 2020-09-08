package com.liyuan.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class ConversionServiceTest<S,T> {

    @Autowired
    ConversionService conversionService;


    public T test(S source, Class<T> targetType) {
        T convert = conversionService.convert(source, targetType);
        return convert;
    }
}
