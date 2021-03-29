package com.homework6.SpringAopAction;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class TimerAspect {
    long start,time;
    @Pointcut("execution(* com.homework6.dao.UserDaoImpl.*(..))")
    public void pc(){
    }
    @Before("pc()")
    public void bf(){
        start=System.currentTimeMillis();
    }
    @After("pc()")
    public void af(JoinPoint joinPoint){
        MonitorTime monitorTime = new MonitorTime();
        monitorTime.setClassName(joinPoint.getTarget().getClass().getName());
        monitorTime.setMethodName(joinPoint.getSignature().getName());
        monitorTime.setLogTime(new Date());
        time=System.currentTimeMillis()-start;
        monitorTime.setConsumeTime(time);
        MonitorUtils.report(monitorTime);
    }
}
