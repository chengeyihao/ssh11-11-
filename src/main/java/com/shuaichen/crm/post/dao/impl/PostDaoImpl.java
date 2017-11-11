package com.shuaichen.crm.post.dao.impl;

import com.shuaichen.crm.post.dao.PostDao;
import com.shuaichen.crm.post.domain.Post;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
public class PostDaoImpl extends HibernateDaoSupport implements PostDao{


    @Override
    public List<Post> query() {
        List<Post> list = (List<Post>) getHibernateTemplate().find("from Post");
        return list;
    }

    @Override
    public void saveOrUpdate(Post post) {

    }
}
