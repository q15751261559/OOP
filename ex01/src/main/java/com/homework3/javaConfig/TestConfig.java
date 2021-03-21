package com.homework3.javaConfig;

import com.homework3.controller.TestController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
        TestController tc=ac.getBean(TestController.class);
        tc.save();
        ac.close();
    }
}
