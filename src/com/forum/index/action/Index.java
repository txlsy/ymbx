package com.forum.index.action;

import com.component.bean.PostBeanTest;
import com.component.bean.intf.PostBean;
import com.component.model.Post;
import com.forum.action.BaseAction;

import java.util.ArrayList;

/**
 * Created by Mark on 2015/5/14.
 */
public class Index extends BaseAction {

    private int length;
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private ArrayList<Post> posts;
    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    private PostBean postBean;
    public PostBean getPostBean() {
        return postBean;
    }

    public void setPostBean(PostBean postBean) {
        this.postBean = postBean;
    }

    public String execute(){
        postBean = new PostBeanTest();
        posts = postBean.getIndexPosts();
        setLength(posts.size());
        return SUCCESS;
    }
}
