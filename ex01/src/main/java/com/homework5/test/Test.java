package com.homework5.test;

import com.homework5.dao.UserDao;
import com.homework5.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AspectjAOPConfig.class);
        UserDao userDao=ac.getBean(UserDao.class);
        userDao.insertUser(new User("Mary","123"));
    }
}
