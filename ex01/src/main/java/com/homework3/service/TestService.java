package com.homework3.service;

import com.homework3.dao.TestDao;

public class TestService {
    TestDao testDao;

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }
    public void save(){
        testDao.save();
    }
}
