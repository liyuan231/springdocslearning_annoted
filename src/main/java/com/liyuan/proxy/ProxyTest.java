package com.liyuan.proxy;

import com.liyuan.aop.LockMixin;
import com.liyuan.aop.LockMixinAdvisor;
import com.liyuan.model.Person;
import com.liyuan.model.PersonImpl;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.interceptor.DebugInterceptor;
import org.springframework.lang.Nullable;

public class ProxyTest {
    public static void main(String[] args) {
        PersonImpl person = new PersonImpl("李源", 19);
        ProxyFactory factory = new ProxyFactory(person);
//        DebugInterceptor debugInterceptor = new DebugInterceptor();
        factory.addAdvice(new LockMixin());
        factory.addAdvisor(new LockMixinAdvisor());
        Person proxy = (Person) factory.getProxy();
        Advised p = (Advised) proxy;
        Advisor[] advisors = p.getAdvisors();
        System.out.println("old advisors count -> " + advisors.length);

        p.addAdvice(new DebugInterceptor());

        System.out.println("new advisors length -> " + advisors.length);
//        p.addAdvisor(new DefaultPointcutAdvisor());
//        System.out.println(proxy.getName());
    }
}


