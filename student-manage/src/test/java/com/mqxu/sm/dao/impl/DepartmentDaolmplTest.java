package com.mqxu.sm.dao.impl;

import com.mqxu.sm.dao.DepartmentDao;
import com.mqxu.sm.entity.Department;
import com.mqxu.sm.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class DepartmentDaolmplTest {
    private final DepartmentDao departmentDao= DaoFactory.getDepartmentDaoInstance();
    @Test
    public void getAll() {
        List<Department> departmentList = null;
        try {
            departmentList = departmentDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assert departmentList != null;
        departmentList.forEach(System.out::println);
    }
}