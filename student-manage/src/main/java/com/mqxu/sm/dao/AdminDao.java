package com.mqxu.sm.dao;
import com.mqxu.sm.entity.Admin;
import java.sql.SQLException;

public interface AdminDao {
    Admin findAdminByAccount(String account) throws SQLException;
}
