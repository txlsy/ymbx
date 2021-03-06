package com.forum.index.action;

import com.component.bean.intf.PosterBean;
import com.component.common.Container;
import com.component.model.Poster;
import com.forum.action.BaseAction;
import com.opensymphony.xwork2.inject.Inject;

import java.util.ArrayList;

/**
 * Created by Mark on 2015/5/14.
 */
public class Index extends BaseAction {

    private int length;
    private ArrayList<Poster> posters;

    @Inject(value = "posterBean")
    private PosterBean posterBean;

    public int getLength() {
        return length;
    }

    public ArrayList<Poster> getPosters() {
        return posters;
    }
    public void setPosters(ArrayList<Poster> posters) {
        this.posters = posters;
    }

    public PosterBean getPosterBean() {
        return posterBean;
    }
    public void setPosterBean(PosterBean posterBean) {
        this.posterBean = posterBean;
    }


    public String execute(){
        posters = posterBean.getIndexPosts();
        this.length = posters.size();
        return SUCCESS;
    }
}