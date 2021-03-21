package com.homework4.controller;

import com.homework4.User;
import com.homework4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void save(){
        List<User> users=userService.queryUserList();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
