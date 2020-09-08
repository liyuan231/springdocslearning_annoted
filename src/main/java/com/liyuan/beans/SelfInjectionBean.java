package com.liyuan.beans;

import com.liyuan.myqualifier.MyQualifier;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Scope
public class SelfInjectionBean {
    @Autowired
    @MyQualifier("selfInjectionBean")
    public SelfInjectionBean selfInjectionBeanz;

}
