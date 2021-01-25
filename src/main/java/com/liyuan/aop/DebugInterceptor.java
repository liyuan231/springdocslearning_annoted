package com.liyuan.aop;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class DebugInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method,
                            Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println("Before invocation:[" + methodProxy + "]");
        Object invoke = method.invoke(methodProxy, objects);
//        methodProxy.invoke(method,objects);
        System.out.println("Invocation returned!");
        return invoke;
    }


    public void test(){
        System.out.println("test!");
    }

}
