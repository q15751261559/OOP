package com.homework2.test;

import com.homework2.annotation.ConfigAnnotation;
import com.homework2.controller.TestController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(ConfigAnnotation.class);
        TestController tc=ac.getBean(TestController.class);
        tc.save();
        ac.close();
    }
}
