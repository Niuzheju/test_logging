package com.baidu.logging.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Slf4jUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jUtil.class);

    public static void info(String msg){
        LOGGER.info(msg);
    }

    public static void error(String msg){
        LOGGER.error(msg);
    }

    public static void error(String msg, Exception e){
        LOGGER.error(msg, e);
    }

    public static void error(Exception e){
        LOGGER.error("", e);
    }
}
