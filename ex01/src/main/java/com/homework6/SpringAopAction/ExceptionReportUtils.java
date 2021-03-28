package com.homework6.SpringAopAction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExceptionReportUtils {
    private static Logger logger= LogManager.getLogger(TimerAspect.class);
    public static void report(ExceptionInfo exceptionInfo){
        logger.info("异常监控："+exceptionInfo.getClassName()+"类的"+exceptionInfo.getMethodName()+"方法调用时发生了异常："+exceptionInfo.getMessage());
    }
}
