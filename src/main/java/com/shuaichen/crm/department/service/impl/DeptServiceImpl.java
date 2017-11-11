package com.shuaichen.crm.department.service.impl;

import com.shuaichen.crm.department.dao.DeptDao;
import com.shuaichen.crm.department.domain.Department;
import com.shuaichen.crm.department.service.DeptService;

import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public class DeptServiceImpl  implements DeptService {

    private DeptDao deptDao;

    @Override
    public List<Department> query() {

        return deptDao.query();
    }

    @Override
    public List<Department> saveOrUpdate(Department department) {
        return deptDao.saveOrUpdate(department);
    }



    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }
}
