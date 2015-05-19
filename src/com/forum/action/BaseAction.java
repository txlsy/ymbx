package com.forum.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Mark on 2015/5/14.
 */
public class BaseAction extends ActionSupport {
    private String poster;

    public void setPoster(String poster) {
        this.poster = poster;
    }
    public String getPoster(){
        return this.poster;
    }

    public String execute(){
        return SUCCESS;
    }
}
