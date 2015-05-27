package com.forum.anime.action;

import com.component.bean.AnimeBeanTest;
import com.component.bean.intf.AnimeBean;
import com.component.model.Anime;
import com.forum.action.BaseAction;
import com.opensymphony.xwork2.inject.Inject;

/**
 * Created by Mark on 2015/5/21.
 */
public class AnimeAction extends BaseAction {

    private  int id;
    private Anime anime;

    @Inject(value = "animeBean")
    private AnimeBean animeBean;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Anime getAnime() {
        return anime;
    }

    public String execute(){

        return SUCCESS;
    }

    public String info(){
        anime = animeBean.getAnimeById(id);
        return "info";
    }
}
