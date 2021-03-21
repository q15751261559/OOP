package com.homework4.test;

import com.homework4.annotation.ConfigAnnotation;
import com.homework4.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(ConfigAnnotation.class);
        UserController uc=ac.getBean(UserController.class);
        uc.save();
        ac.close();
    }
}
