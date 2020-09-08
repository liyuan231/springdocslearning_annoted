package com.liyuan.beanPostProcessor;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class DefaultListableBeanFactoryTest {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.addBeanPostProcessor(new AutowiredAnnotationBeanPostProcessor());
        defaultListableBeanFactory.addBeanPostProcessor(new MyBeanPostProcessor());
        String[] beanDefinitionNames = defaultListableBeanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
