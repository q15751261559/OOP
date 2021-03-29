package com.homework6.SpringAopAction;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class ExceptionMonitor {
    @Pointcut("execution(* com.homework6.dao.UserDaoImpl.*(..))")
    public void pc(){
    }
    @AfterThrowing(value = "pc()",throwing = "e")
    public void at(JoinPoint joinPoint, Throwable e){
        ExceptionInfo exceptionInfo = new ExceptionInfo();
        exceptionInfo.setClassName(joinPoint.getTarget().getClass().getName());
        exceptionInfo.setMethodName(joinPoint.getSignature().getName());
        exceptionInfo.setLogTime(new Date());
        exceptionInfo.setMessage(e.getMessage());
        ExceptionReportUtils.report(exceptionInfo);
    }
}
