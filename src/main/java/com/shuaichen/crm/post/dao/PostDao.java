package com.shuaichen.crm.post.dao;

import com.shuaichen.crm.post.domain.Post;

import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
public interface PostDao {

    List<Post> query();

    void saveOrUpdate(Post post);

}
