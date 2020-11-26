package com.mqxu.sm.service.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mqxu.sm.dao.AdminDao;
import com.mqxu.sm.entity.Admin;
import com.mqxu.sm.factory.DaoFactory;
import com.mqxu.sm.service.AdminService;
import com.mqxu.sm.utils.ResultEntity;
import org.apache.commons.codec.digest.DigestUtils;

public class AdminServiceImpl implements AdminService {
    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();
    public ResultEntity adminLogin(String account, String password) {
        ResultEntity resultEntity;
        Admin admin = null;
        try {
            //根据账号查找管理员信息，捕获SQL异常
            admin = adminDao.findAdminByAccount(account);
        } catch (SQLException e) {
            System.out.println("根据账号查找管理员信息出现SQL异常");
        }
        //根据账号查找到了记录
        if (admin != null) {
            //比较密码，此时需要将客户端传过来的密码进行MD5加密后才能对比
            if (DigestUtils.md5Hex(password).equals(admin.getPassword())) {
                resultEntity = ResultEntity.builder().code(0).message("登陆成功").data(admin).build();
            } else { //账号存在，密码输入错误
                resultEntity = ResultEntity.builder().code(1).message("密码错误").build();
            }
        } else { //账号不存在
            resultEntity = ResultEntity.builder().code(2).message("账号不存在").build();
        }
        return resultEntity;
    }
}
