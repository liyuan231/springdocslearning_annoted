package com.liyuan.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogTest {
    private static final Log log = LogFactory.getLog(LogTest.class);

    public static void main(String[] args) {
        log.debug("logogogog{}");
        log.info("logogogog{}");
        log.error("logogogog{}");
        log.fatal("logogogog{}");
    }
}
