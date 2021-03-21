package com.homework2.controller;

import com.homework2.service.MyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    @Autowired
    private MyServiceImpl myService;
    public void save() {
        myService.save();
        System.out.println("testController save");
    }
}
