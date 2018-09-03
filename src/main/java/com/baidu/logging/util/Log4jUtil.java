package com.baidu.logging.util;

import org.apache.log4j.Logger;

public final class Log4jUtil {

    private static final Logger LOGGER = Logger.getLogger(Log4jUtil.class);

    public static void info(String msg){
        LOGGER.info(msg);
    }

    public static void error(String msg){
        LOGGER.error(msg);
    }

    public static void error(Exception ex){
        LOGGER.error("", ex);
    }

    public static void error(String msg, Exception ex){
        LOGGER.error(msg, ex);
    }


}
