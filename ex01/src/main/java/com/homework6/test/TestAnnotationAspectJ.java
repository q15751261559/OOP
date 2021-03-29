package com.homework6.test;

import com.homework6.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes =AspectJAOPConfig.class)
public class TestAnnotationAspectJ {
    @Autowired
    private UserDao userDao;

    @Test
    void test(){
        userDao.addUser();
        userDao.deleteUser();
    }
}
