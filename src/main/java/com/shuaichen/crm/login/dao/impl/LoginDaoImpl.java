package com.shuaichen.crm.login.dao.impl;

import com.shuaichen.crm.login.dao.LoginDao;
import com.shuaichen.crm.staff.domain.Staff;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */

public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {


    @Override
    public List<Staff> query(String loginName, String loginPwd) {
        Object[] value = {loginName,loginPwd};
        String sql = "from Staff T_STAFF where loginName = ? and loginPwd = ?";
        List<Staff> list = (List<Staff>) getHibernateTemplate()
                .find(sql, value);
        return list;
    }
}
