package com.liyuan.beanPostProcessor;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

public class DefaultListableBeanFactoryTest2 {
    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);
        xmlBeanDefinitionReader.loadBeanDefinitions(new FileSystemResource("D:\\Cache\\IdeaProjects\\SpringDocsLearning-Annotated\\src\\main\\resources\\spring.xml"));

        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new FileSystemResource("D:\\Cache\\IdeaProjects\\SpringDocsLearning-Annotated\\src\\main\\resources\\application.properties"));

        configurer.postProcessBeanFactory(factory);
    }
}
