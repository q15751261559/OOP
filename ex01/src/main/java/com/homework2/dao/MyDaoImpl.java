package com.homework2.dao;

import org.springframework.stereotype.Repository;

@Repository("MyDaoImpl")
public class MyDaoImpl implements MyDao {
    @Override
    public void save(){
        System.out.println("testDao save");
    }
}
