package com.homework6.dao;

import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        for (int i = 0; i < 100000; i++) {

        }
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        for (int i = 0; i < 100000; i++) {
        }
        int a=10/0;
        System.out.println("删除用户");
    }
}
