package com.homework5.interceptor;
import com.homework5.dao.UserDaoImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvice {
    private final Logger logger=LogManager.getLogger(UserDaoImpl.class);
    @Pointcut("execution(* com.homework5.dao.UserDaoImpl.*(..))")
    public void pc(){
    }

    @Before("MyAdvice.pc()")
    public void before(){
        logger.info("--等待新用户添加--");
    }

    @AfterReturning("execution(* com.homework5.dao.UserDaoImpl.*(..))")
    public void ar(){
        logger.info("--用户添加完成--");
    }
    @AfterThrowing("execution(* com.homework5.dao.UserDaoImpl.*(..))")
    public void at(){
        logger.error("出现异常!!!");
    }
}
