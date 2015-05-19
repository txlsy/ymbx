package com.component.bean.intf;

import com.component.model.Post;

import java.util.ArrayList;

/**
 * Created by Mark on 2015/5/17.
 */
public interface PostBean {

    /**
     * 获得在首页显示的近期番组的海报及改番组的基本信息
     * @return 一个包含番组的list
     */
    public ArrayList<Post> getIndexPosts();
}
