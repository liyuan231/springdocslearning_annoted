package com.liyuan.autowired;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class SpringAction {
    private FactoryDao factoryDao;

    @Inject
    public void setFactoryDao(FactoryDao factoryDao) {
        this.factoryDao = factoryDao;
    }
}
