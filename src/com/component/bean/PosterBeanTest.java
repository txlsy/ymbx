package com.component.bean;

import com.component.Dao.PosterDaoTest;
import com.component.Dao.intf.PosterDao;
import com.component.bean.intf.PosterBean;
import com.component.model.Poster;

import java.util.ArrayList;

/**
 * Created by Mark on 2015/5/17.
 */
public class PosterBeanTest implements PosterBean {

    @Override
    public ArrayList<Poster> getIndexPosts() {
        PosterDao posterDao = new PosterDaoTest();
        return (ArrayList<Poster>) posterDao.getAll();
    }
}
