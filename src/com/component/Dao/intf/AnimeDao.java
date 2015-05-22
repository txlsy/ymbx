package com.component.dao.intf;

import com.component.model.Anime;

import java.util.List;

/**
 * Created by Mark on 2015/5/22.
 */
public interface AnimeDao {
    public List<Anime> getAll();
    public Anime getAnimeById(int id);
}
