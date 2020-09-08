package com.liyuan.property;


import org.springframework.core.env.PropertySource;

public class MyPropertySource extends PropertySource {

    public MyPropertySource(String name) {
        super(name);
    }

    @Override
    public Object getProperty(String name) {
        return null;
    }
}
