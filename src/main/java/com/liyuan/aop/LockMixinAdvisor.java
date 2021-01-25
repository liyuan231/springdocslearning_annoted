package com.liyuan.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.support.DefaultIntroductionAdvisor;

public class LockMixinAdvisor extends DefaultIntroductionAdvisor {
    public LockMixinAdvisor() {
        super(new LockMixin(),Lockable.class);
    }
}
