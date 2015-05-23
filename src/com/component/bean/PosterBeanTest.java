package com.component.bean;

import com.component.bean.intf.PosterBean;
import com.component.Dao.intf.PosterDao;
import com.component.model.Poster;
import com.opensymphony.xwork2.inject.Inject;

import java.util.ArrayList;

/**
 * Created by Mark on 2015/5/17.
 */
public class PosterBeanTest implements PosterBean {

    @Inject(value = "posterDao")
    private PosterDao posterDao;

    public ArrayList<Poster> getIndexPosts() {
        return (ArrayList<Poster>) posterDao.getAll();
    }

    public void setPosterDao(PosterDao posterDao) {
        this.posterDao = posterDao;
    }
}
