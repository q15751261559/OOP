package com.mqxu.sm.dao;

import com.mqxu.sm.entity.Admin;
import com.mqxu.sm.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class AdminDaoTest {
    private final AdminDao adminDao= DaoFactory.getAdminDaoInstance();
    @Test
    public void testFindAdminByAccount() {
        Admin admin;
        try {
            admin=adminDao.findAdminByAccount("3328585084@qq.com");
            assertEquals("石振宇",admin.getAdminName());
            System.out.println(admin);
        }catch (SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
}