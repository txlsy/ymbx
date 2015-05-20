package com.component.bean;

import com.component.bean.intf.PosterBean;
import com.component.model.Poster;

import java.util.ArrayList;

/**
 * Created by Mark on 2015/5/17.
 */
public class PosterBeanTest implements PosterBean {
    @Override
    public ArrayList<Poster> getIndexPosts() {
        ArrayList<Poster> posters = new ArrayList<Poster>();
        for(int i=1;i<=8;i++){
            Poster poster = new Poster();
            poster.setId(i);
            poster.setImg(i+".jpg");
            poster.setTitle("title"+i);
            posters.add(poster);
        }
        return posters;
    }
}
