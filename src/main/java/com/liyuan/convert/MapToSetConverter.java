package com.liyuan.convert;

import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapToSetConverter implements Converter<Map, Set> {
    @Override
    public Set convert(Map source) {
        System.out.println("Map["+source+"] is being converted to set!");
        Set set = new HashSet();
        set.addAll(source.entrySet());
        return set;
    }
}
