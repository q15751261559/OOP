package com.mqxu.sm.factory;
import com.mqxu.sm.service.AdminService;
import com.mqxu.sm.service.DepartmentService;
import com.mqxu.sm.service.impl.AdminServiceImpl;
import com.mqxu.sm.service.impl.DepartmentServicelmpl;

public class ServiceFactory {
    public static AdminService getAdminServiceInstance() {
        return new AdminServiceImpl();
    }

    public static DepartmentService getDepartmentServiceInstance() {
        return new DepartmentServicelmpl();
    }

    public static DepartmentService delectDepartmentSerivceInstance() {
        return new DepartmentServicelmpl();
    }

//    public static ClazzService getClazzServiceInstance() {
//        return new ClazzServiceImpl();
//    }
//
//    public static ClazzService delectClazzServiceInstance() {
//        return new ClazzServiceImpl();
//    }
//
//    public static StudentService getStudentServiceInstance() {
//        return new StudentServiceImpl();
//    }
//
//    public static StudentService searchDepartmentNameServiceInstance() {
//        return new StudentServiceImpl();
//    }
}
