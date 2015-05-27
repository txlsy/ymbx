package com.component.bean;

import com.component.Dao.AnimeDaoTest;
import com.component.Dao.intf.AnimeDao;
import com.component.bean.intf.AnimeBean;
import com.component.model.Anime;
import com.opensymphony.xwork2.inject.Inject;

import java.util.List;

/**
 * Created by Mark on 2015/5/22.
 */
public class AnimeBeanTest implements AnimeBean {

    @Inject(value = "animeDao")
    private AnimeDao animeDao;
    @Override
    public List<Anime> getAll() {
        return null;
    }

    @Override
    public Anime getAnimeById(int id) {
        return animeDao.getAnimeById(id);
    }
}
