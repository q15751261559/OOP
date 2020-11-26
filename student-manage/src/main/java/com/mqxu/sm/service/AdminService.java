package com.mqxu.sm.service;
import com.mqxu.sm.utils.ResultEntity;
public interface AdminService {
    ResultEntity adminLogin(String account, String password);
}
