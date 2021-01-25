package com.liyuan.aop;

import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;

public class Main {
    public static void main(String[] args) {
        Pojo pojo = new SimplePojo();
        System.out.println(pojo);
        pojo.foo();
    }

    @Test
    public void test1() {
        ProxyFactory factory = new ProxyFactory(new SimplePojo());
//        factory.setInterfaces(Pojo.class);
//        factory.addAdvice(new RetryAdvice());
        factory.setExposeProxy(true);
        Pojo pojo = (Pojo) factory.getProxy();
         pojo.foo();
    }
}
