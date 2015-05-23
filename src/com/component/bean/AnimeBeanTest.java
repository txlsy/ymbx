package com.component.bean;

import com.component.Dao.AnimeDaoTest;
import com.component.bean.intf.AnimeBean;
import com.component.model.Anime;

import java.util.List;

/**
 * Created by Mark on 2015/5/22.
 */
public class AnimeBeanTest implements AnimeBean {
    @Override
    public List<Anime> getAll() {
        return null;
    }

    @Override
    public Anime getAnimeById(int id) {
        AnimeDaoTest animeDaoTest = new AnimeDaoTest();
        return animeDaoTest.getAnimeById(id);
    }
}
