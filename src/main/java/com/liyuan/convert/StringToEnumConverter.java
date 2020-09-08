package com.liyuan.convert;

import org.springframework.core.convert.converter.Converter;

public class StringToEnumConverter<T extends Enum> implements Converter<String, T> {
    private Class<T> enumType;

    public StringToEnumConverter(Class<T> enumType) {
        this.enumType = enumType;
    }

    @Override
    public T convert(String source) {
        return (T) Enum.valueOf(this.enumType,source.trim());
    }
}
