package com.homework4.service;

import com.homework4.User;
import com.homework4.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {
    @Autowired(required = false)
    private UserDao userDao;
    public List<User> queryUserList(){
        return userDao.queryUserList();
    }
}
