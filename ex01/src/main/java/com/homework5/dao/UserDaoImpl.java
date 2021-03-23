package com.homework5.dao;

import com.homework5.domain.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public int insertUser(User user){
        System.out.println("添加用户"+user.getAccount());
        return 1;
    }
}
