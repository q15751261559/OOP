package com.homework3.javaConfig;

import com.homework3.controller.TestController;
import com.homework3.dao.TestDao;
import com.homework3.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public TestDao getTestDao(){
        return new TestDao();
    }
    @Bean
    public TestService getTestService(){
        TestService ts=new TestService();
        ts.setTestDao(getTestDao());
        return ts;
    }
    @Bean
    public TestController getTestController(){
        TestController tc=new TestController();
        tc.setTestService(getTestService());
        return tc;
    }
}
