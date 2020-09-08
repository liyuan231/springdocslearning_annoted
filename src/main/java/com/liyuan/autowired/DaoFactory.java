package com.liyuan.autowired;

public class DaoFactory {
    public static final FactoryDao getStaticFactoryDaoImpl(){
        return new StaticFactoryDaoImpl();
    }
}
