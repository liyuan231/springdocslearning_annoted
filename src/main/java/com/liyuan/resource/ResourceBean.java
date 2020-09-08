package com.liyuan.resource;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.io.IOException;

/**
 *
 */
@Component
public class ResourceBean implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void test() throws IOException {
        System.out.println(resourceLoader.getClassLoader());
        Resource resource = resourceLoader.getResource("classpath:application.properties");
        System.out.println(resource.contentLength());
    }
}
