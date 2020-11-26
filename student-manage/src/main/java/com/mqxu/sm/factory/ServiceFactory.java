package com.mqxu.sm.factory;
import com.mqxu.sm.service.AdminService;
import com.mqxu.sm.service.impl.AdminServiceImpl;
public class ServiceFactory {
    public static AdminService getAdminServiceInstance() {
        return new AdminServiceImpl();
    }
}
