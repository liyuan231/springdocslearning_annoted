package com.liyuan.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;

//@Component
public class ContextRefreshedEventTest extends ContextRefreshedEvent {
    /**
     * Create a new ContextRefreshedEvent.
     *
     * @param source the {@code ApplicationContext} that has been initialized
     *               or refreshed (must not be {@code null})
     */
    public ContextRefreshedEventTest(ApplicationContext source) {
        super(source);
    }

}
