package com.mqxu.sm.service;
import com.mqxu.sm.factory.ServiceFactory;
import com.mqxu.sm.utils.ResultEntity;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdminServiceTest {
    private final AdminService adminService=ServiceFactory.getAdminServiceInstance();

    @Test
    public void testAdminLogin() {
        ResultEntity resultEntity=adminService.adminLogin("3328585084@qq.com","q83228621");
        System.out.println(resultEntity);
    }
}