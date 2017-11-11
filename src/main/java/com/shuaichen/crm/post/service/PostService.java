package com.shuaichen.crm.post.service;

import com.shuaichen.crm.post.domain.Post;

import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
public interface PostService {

    List<Post> query();

    void saveOrUpdate();

}
