package com.mqxu.sm.service;
import com.mqxu.sm.entity.Department;

import java.util.List;
public interface DepartmentService {
    List<Department> selectAll();

    /**
     * 删除院系
     *
     * @param id
     */
    void delectDep(Integer id);

    /**
     * 新增院系
     *
     * @parm department 入参
     * @return int
     */
    int addDepartment(Department department);
}
