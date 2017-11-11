package com.shuaichen.crm.post.service.impl;

import com.shuaichen.crm.post.dao.PostDao;
import com.shuaichen.crm.post.domain.Post;
import com.shuaichen.crm.post.service.PostService;

import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
public class PostServiceImpl implements PostService {

    private PostDao postDao;

    @Override
    public List<Post> query() {
        return postDao.query();
    }

    @Override
    public void saveOrUpdate() {

    }

    public void setPostDao(PostDao postDao) {
        this.postDao = postDao;
    }

}
