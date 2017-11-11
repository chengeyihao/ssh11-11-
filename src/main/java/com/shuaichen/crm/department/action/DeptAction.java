package com.shuaichen.crm.department.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shuaichen.crm.department.domain.Department;
import com.shuaichen.crm.department.service.DeptService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public class DeptAction extends ActionSupport implements ModelDriven<Department> {

    private Department department = new Department();
    @Resource
    private DeptService deptService;
    private List<Department> departments;

    public String query() {
        departments = deptService.query();
        return SUCCESS;
    }

    public String saveOrUpdate() {
        deptService.saveOrUpdate(department);
        return SUCCESS;
    }


    @Override
    public Department getModel() {
        return department;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
