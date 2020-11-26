package com.mqxu.sm.service.impl;

import com.mqxu.sm.dao.DepartmentDao;
import com.mqxu.sm.entity.Department;
import com.mqxu.sm.factory.DaoFactory;
import com.mqxu.sm.service.DepartmentService;

import java.sql.SQLException;
import java.util.List;

public class DepartmentServicelmpl implements DepartmentService {
    private final DepartmentDao departmentDao = DaoFactory.getDepartmentDaoInstance();

    @Override
    public List<Department> selectAll() {
        List<Department> departmentList = null;
        try {
            departmentList = departmentDao.getAll();
        } catch (SQLException e) {
            System.out.println("查询院系信息出现异常");
        }
        return departmentList;
    }

    @Override
    public void delectDep(Integer id) {
        try {
            departmentDao.delectDep(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int addDepartment(Department department) {
        int n = 0;
        try {
            n = departmentDao.insertDepartment(department);
        } catch (SQLException e) {
            System.out.println("新增院系信息出现异常");
        }
        return n;
    }
}
