package com.liyuan.event;

import org.springframework.context.ApplicationEvent;

public class BlockedListEvent extends ApplicationEvent {
    private final String address;
    private final String content;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public BlockedListEvent(Object source, String address, String content) {
        super(source);
        this.address = address;
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "BlockedListEvent{" +
                "address='" + address + '\'' +
                ", content='" + content + '\'' +
                ", source=" + source +
                '}';
    }
}
