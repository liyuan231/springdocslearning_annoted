package com.liyuan.loadTimeweaver;

import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.stereotype.Component;

import java.lang.instrument.ClassFileTransformer;

@Component
public class MyLoadTimeWeaver implements LoadTimeWeaver {
    @Override
    public void addTransformer(ClassFileTransformer transformer) {

    }

    @Override
    public ClassLoader getInstrumentableClassLoader() {
        return null;
    }

    @Override
    public ClassLoader getThrowawayClassLoader() {
        return null;
    }
}
