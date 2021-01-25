package com.liyuan.aop;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

public class AspectJTest {
    public static void main(String[] args) {
        AspectJProxyFactory factory = new AspectJProxyFactory(new SimplePojo());
        factory.addAspect(AnAspect.class);
        Pojo proxy = factory.getProxy();
        proxy.bar();
    }
}
