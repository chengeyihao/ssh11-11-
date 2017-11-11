package com.shuaichen.crm.department.service;

import com.shuaichen.crm.department.domain.Department;
import com.shuaichen.crm.staff.domain.Staff;

import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public interface DeptService {

    List<Department> query();

    List<Department> saveOrUpdate(Department department);


}
