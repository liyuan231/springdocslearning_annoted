package com.liyuan.scopeResolution;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;

public class MyScopeMetaResolver implements ScopeMetadataResolver {
    @Override
    public ScopeMetadata resolveScopeMetadata(BeanDefinition definition) {
//        System.out.println(definition);
        ScopeMetadata scopeMetadata = new ScopeMetadata();
        return scopeMetadata;
    }
}
