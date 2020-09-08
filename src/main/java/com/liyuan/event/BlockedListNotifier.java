package com.liyuan.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BlockedListNotifier  {
    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @EventListener
    public MyEvent onApplicationEvent(BlockedListEvent event) {
        System.out.println("BlockedListNotifier已收到BlockedListEvent");
        System.out.println(event.toString());
        return new MyEvent(this,"myEvent!");
    }
    @EventListener
    public void handleEvent(MyEvent myEvent){
        System.out.println(myEvent.toString());
    }
}
