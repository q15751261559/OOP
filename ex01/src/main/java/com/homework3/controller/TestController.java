package com.homework3.controller;

import com.homework3.service.TestService;

public class TestController {
    TestService testService;
    public void setTestService(TestService testService) {
        this.testService = testService;
    }
    public void save(){
        testService.save();
    }
}
