package com.liyuan.aspect;

import com.liyuan.aop.DebugInterceptor;
import com.liyuan.controller.MappingController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml","aop.xml");
//        MappingController mappingController = (MappingController) applicationContext.getBean("mappingController2");
        MappingController mappingController = new MappingController();
        DebugInterceptor debugInterceptor = (DebugInterceptor) applicationContext.getBean("debugInterceptor");
        debugInterceptor.test();

//        System.out.println(mappingController.index());


        mappingController.index();
//        InstructionS
//        InstructionSav
    }


}