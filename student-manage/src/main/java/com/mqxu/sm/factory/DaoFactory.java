package com.mqxu.sm.factory;
import com.mqxu.sm.dao.AdminDao;
import com.mqxu.sm.dao.DepartmentDao;
import com.mqxu.sm.dao.DepartmentDao;
import com.mqxu.sm.dao.impl.AdminDaoImpl;
import com.mqxu.sm.dao.impl.DepartmentDaolmpl;
public class DaoFactory {
    /**
     * 获取AdminDao实例
     *
     * @return AdminDao实例
     */
    public static AdminDao getAdminDaoInstance() {
        return new AdminDaoImpl();
    }

    /**
     * 获取DepartmentDao实例
     *
     * @return AdminDao实例
     */
    public static DepartmentDao getDepartmentDaoInstance() {
        return new DepartmentDaolmpl();
    }
}
