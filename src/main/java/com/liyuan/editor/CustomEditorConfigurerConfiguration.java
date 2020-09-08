package com.liyuan.editor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomEditorConfigurerConfiguration extends CustomEditorConfigurer {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.addPropertyEditorRegistrar(new CustomPropertyEditorRegistrar());
        super.postProcessBeanFactory(beanFactory);
    }
}
