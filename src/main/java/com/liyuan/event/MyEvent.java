package com.liyuan.event;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }

    public MyEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "message='" + message + '\'' +
                ", source=" + source +
                '}';
    }
}
