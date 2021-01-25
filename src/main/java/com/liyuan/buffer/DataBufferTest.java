package com.liyuan.buffer;

import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;

public class DataBufferTest {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(Applica);
        DataBufferFactory dataBufferFactory = new DefaultDataBufferFactory();
        DataBuffer dataBuffer = dataBufferFactory.allocateBuffer();
//        dataBuffer.
        boolean release = true;
        try {
            release = false;
        } finally {
            if (release) {
                DataBufferUtils.release(dataBuffer);
            }
        }
    }
}
