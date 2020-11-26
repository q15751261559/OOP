package com.mqxu.sm.dao;

import com.mqxu.sm.entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentDao {
    List<Department> getAll() throws SQLException;
    void delectDep(Integer id) throws SQLException;
    int insertDepartment(Department department) throws SQLException;
}
