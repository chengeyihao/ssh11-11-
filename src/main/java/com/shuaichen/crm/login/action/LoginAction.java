package com.shuaichen.crm.login.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shuaichen.crm.login.service.LoginService;
import com.shuaichen.crm.staff.domain.Staff;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public class LoginAction extends ActionSupport implements ModelDriven<Staff> {

    private Staff staff = new Staff();
    @Resource
    private LoginService loginService;
    private List<Staff> staffs;

    public String query(){
        staffs = loginService.query(staff.getLoginName(), staff.getLoginPwd());
        if(staffs.isEmpty()){
            return ERROR;
        }
        ActionContext.getContext().getSession().put("username", staffs.get(0).getLoginName());
        return SUCCESS;

    }


    @Override
    public Staff getModel() {
        return staff;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }
}
