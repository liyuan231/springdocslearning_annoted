package com.liyuan.aop;

import org.springframework.aop.MethodMatcher;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.Pointcuts;

public class MyPointcuts extends ComposablePointcut {

    @Override
    public ComposablePointcut union(MethodMatcher other) {
        return super.union(other);
    }
}
