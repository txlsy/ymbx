package com.component.bean.intf;

import com.component.model.Anime;

import java.util.List;

/**
 * Created by Mark on 2015/5/22.
 */
public interface AnimeBean {

    /**
     * 获得包含所有的动画的列表
     * @return
     */
    public List<Anime> getAll();

    /**
     * 根据主键id获取动画信息
     * @param id 主键
     * @return
     */
    public Anime getAnimeById(int id);
}
