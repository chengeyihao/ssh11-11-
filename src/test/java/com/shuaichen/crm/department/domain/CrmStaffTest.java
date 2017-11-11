package com.shuaichen.crm.department.domain;

import com.shuaichen.crm.utils.HibernateUtil;
import com.shuaichen.crm.post.domain.Post;
import com.shuaichen.crm.staff.domain.Staff;
import org.hibernate.Session;
import org.junit.Test;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;


/**
 * Created by dllo on 17/11/9.
 */
public class CrmStaffTest extends HibernateDaoSupport {

    @Test
    public void test(){
        Session session = HibernateUtil.openSession();
        Department d1 = new Department("教学部");
        Department d2 = new Department("职规部");

        Post p1 = new Post("教学总监");
        Post p2 = new Post("教学主管");
        Post p3 = new Post("讲师");
        Post p4 = new Post("职规主管");
        Post p5 = new Post("班主任");

        p1.setDepartment(d1);
        p2.setDepartment(d1);
        p3.setDepartment(d1);
        p4.setDepartment(d2);
        p5.setDepartment(d2);

        Staff s1 = new Staff("123","123","孟宪义","男","2014-12-89");
        s1.setPost(p1);
        Staff s6 = new Staff("123","123","马琳","女","2014-12-89");
        s6.setPost(p4);
        
        session.save(s1);
        session.save(s6);
//        getHibernateTemplate().saveOrUpdate(s1);
//        getHibernateTemplate().saveOrUpdate(s6);
        HibernateUtil.commit();
    }



}