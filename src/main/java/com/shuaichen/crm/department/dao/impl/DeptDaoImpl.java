package com.shuaichen.crm.department.dao.impl;

import com.shuaichen.crm.department.dao.DeptDao;
import com.shuaichen.crm.department.domain.Department;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public class DeptDaoImpl extends HibernateDaoSupport implements DeptDao {

    @Override
    public List<Department> query() {
        List<Department> list = (List<Department>)
                getHibernateTemplate().find("from Department T_DEPT");
        return list;
    }

    @Override
    public List<Department> saveOrUpdate(Department department) {
        if (department.getDepId().isEmpty()){
            getHibernateTemplate().save(department);
        }else {
            getHibernateTemplate().saveOrUpdate(department);
        }
        return null;
    }


}
