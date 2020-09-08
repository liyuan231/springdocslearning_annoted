package com.liyuan.annotation;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodComponent {
//    private static int i;
//
//    @Bean
//    @Qualifier("public")
//    public TestBean publicImstance() {
//        return new TestBean("Liyuan");
//    }
//
//    @Bean
//    protected TestBean protectedBean(@Qualifier("public") TestBean testBean,
//                                     @Value("#{privateInstance.age}") String age) {
//        TestBean testBean1 = new TestBean(1, "protectedInstance");
//        System.out.println(testBean.toString());
//        System.out.println(age);
//        return testBean1;
//    }
//
//    @Bean
//    private TestBean privateInstance() {
//        return new TestBean(-1, "privateBean");
//    }
//
//    @Bean
//    public TestBean requestBean() {
//        return new TestBean(3, "requestBean");
//    }

//    @Bean
//    @Scope("prototype")
//    public TestBean prototype(InjectionPoint injectionPoint) {
//        return new TestBean("prototypeInstance for " );
//    }
}
