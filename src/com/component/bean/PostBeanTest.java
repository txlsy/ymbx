package com.component.bean;

import com.component.bean.intf.PostBean;
import com.component.model.Post;

import java.util.ArrayList;

/**
 * Created by Mark on 2015/5/17.
 */
public class PostBeanTest implements PostBean {
    @Override
    public ArrayList<Post> getIndexPosts() {
        ArrayList<Post> posts = new ArrayList<Post>();
        for(int i=1;i<=8;i++){
            Post post = new Post();
            post.setId(i);
            post.setImg(i+".jpg");
            post.setTitle("title"+i);
            posts.add(post);
        }
        return posts;
    }
}
