package com.liyuan.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ResourceBean2 {
    @Autowired
    ResourceLoader resourceLoader;


    public void test() throws IOException {
        System.out.println(resourceLoader.getClassLoader());
        Resource resource = resourceLoader.getResource("classpath:application.properties");
        System.out.println(resource.contentLength());
    }
}
