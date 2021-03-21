package com.homework2.service;

import com.homework2.dao.MyDao;
import com.homework2.dao.MyDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MyServiceImpl")
public class MyServiceImpl implements MyService{
    @Autowired
    private MyDao myDao;
    @Override
    public void save(){
        myDao.save();
        System.out.println("testService save");
    }
}
