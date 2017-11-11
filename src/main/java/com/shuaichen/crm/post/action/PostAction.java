package com.shuaichen.crm.post.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shuaichen.crm.post.domain.Post;
import com.shuaichen.crm.post.service.PostService;

import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
public class PostAction extends ActionSupport implements ModelDriven<Post>{

    private Post post = new Post();
    private PostService postService;
    private List<Post> query;

    public String query(){
        query = postService.query();
        return SUCCESS;
    }

    public String saveOrUpdate(){
        postService.saveOrUpdate();
        return SUCCESS;
    }

    @Override
    public Post getModel() {
        return post;
    }

    public List<Post> getQuery() {
        return query;
    }

    public void setQuery(List<Post> query) {
        this.query = query;
    }

    public void setPostService(PostService postService) {
        this.postService = postService;
    }
}
