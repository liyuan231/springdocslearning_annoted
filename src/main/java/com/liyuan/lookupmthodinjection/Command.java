package com.liyuan.lookupmthodinjection;

public class Command {
    private Object state;
    public void setState(Object commandState) {
        this.state=commandState;
    }

    public Object execute() {
        return state;
    }
}
