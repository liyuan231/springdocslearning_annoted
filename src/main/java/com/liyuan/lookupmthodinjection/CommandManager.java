package com.liyuan.lookupmthodinjection;

public abstract class CommandManager {
    public Object process(Object commandState){
        Command command = createCommand();
        command.setState(commandState);
        return command.execute();
    }

    protected abstract Command createCommand();
}
