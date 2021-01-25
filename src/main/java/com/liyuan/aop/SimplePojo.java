package com.liyuan.aop;

import org.springframework.aop.framework.AopContext;

public class SimplePojo implements Pojo{
    @Override
    public void foo() {
//        this.bar();
        ((Pojo)(AopContext.currentProxy())).bar();
    }

    @Override
    public void bar() {
        System.out.println("SimplePojo.bar");
    }
}
