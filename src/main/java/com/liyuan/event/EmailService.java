package com.liyuan.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {
    ApplicationEventPublisher applicationEventPublisher;
    private List<String> blockedList;

    public ApplicationEventPublisher getApplicationEventPublisher() {
        return applicationEventPublisher;
    }

    public List<String> getBlockedList() {
        return blockedList;
    }

    @Autowired
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Autowired
    public void setBlockedList(@Value("#{{'123@qq.com','234@qq.com'}}") List<String> blockedList) {
        System.out.println("set blocked list success!");
        this.blockedList = blockedList;
    }

    public void sendEmail(String address, String content) {
        if (blockedList.contains(address)) {
            applicationEventPublisher.publishEvent(new BlockedListEvent(this, address, content));
        }
    }
}
