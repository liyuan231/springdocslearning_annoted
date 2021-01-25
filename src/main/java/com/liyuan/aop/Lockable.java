package com.liyuan.aop;

public interface Lockable {
    void lock();
    void unlock();
    boolean locked();
}
