package com.shuaichen.crm.login.dao;

import com.shuaichen.crm.staff.domain.Staff;

import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public interface LoginDao {
    List<Staff> query(String loginName, String loginPwd);
}
