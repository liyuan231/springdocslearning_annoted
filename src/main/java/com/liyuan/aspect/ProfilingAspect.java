package com.liyuan.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class ProfilingAspect {

    @Around("methodsToBeProfiled()")
    public Object profile(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch(getClass().getSimpleName());
        stopWatch.start(proceedingJoinPoint.getSignature().getName());
        try {
            return proceedingJoinPoint.proceed();
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }
    }
    @Pointcut("execution(public * com.liyuan.controller.*.*(..))")
    public void methodsToBeProfiled() {
    }

}
