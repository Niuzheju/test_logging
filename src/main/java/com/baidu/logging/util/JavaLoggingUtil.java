package com.baidu.logging.util;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 使用java自带的日志工具打印日志
 */
public final class JavaLoggingUtil {

    private static final Logger LOGGER =  Logger.getLogger(JavaLoggingUtil.class.getName());

    public static void setLevel(Level level){
        LOGGER.setLevel(level);
    }

    public static void info(String msg){
        LOGGER.log(Level.INFO, "[" + Thread.currentThread().getStackTrace()[2] + "]:" + msg);
    }

    public static void error(String msg){
        LOGGER.log(Level.SEVERE, "[" + Thread.currentThread().getStackTrace()[2] + "]:" + msg);
    }

    public static void error(Exception ex){
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = ex.getStackTrace();
        for (int i = stackTrace.length - 1; i >= 0; i--) {
            if (i != stackTrace.length - 1){
                sb.append("\t");
            }
            sb.append(stackTrace[i]);
            sb.append("\r\n");
        }
        LOGGER.log(Level.SEVERE, sb.toString());
    }
}
