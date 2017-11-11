package com.shuaichen.crm.login.service.impl;

import com.shuaichen.crm.login.dao.LoginDao;
import com.shuaichen.crm.login.service.LoginService;
import com.shuaichen.crm.staff.domain.Staff;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */

public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginDao loginDao;

    @Override
    public List<Staff> query(String loginName, String loginPwd) {
        return loginDao.query(loginName,loginPwd);
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }
}
