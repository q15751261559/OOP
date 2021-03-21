package com.homework4.dao;

import com.homework4.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Repository("UserDao")
public class UserDao {
    public List<User> queryUserList(){
        List<User> list=new ArrayList<>();
        for (int i=1;i<6;i++)
        {
            User user=new User();
            user.setUserName("userName" +i);
            user.setPassword("password" +i);
            user.setUpdateTime(new Date().getTime());
            list.add(user);
        }
        return list;
    }
}
