package com.forum.anime.action;

import com.component.Dao.AnimeDaoTest;
import com.component.bean.AnimeBeanTest;
import com.component.model.Anime;
import com.forum.action.BaseAction;

/**
 * Created by Mark on 2015/5/21.
 */
public class AnimeAction extends BaseAction {

    private  int id;
    private Anime anime;

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
        AnimeBeanTest animeBeanTest = new AnimeBeanTest();
        anime = animeBeanTest.getAnimeById(id);
        return "info";
    }
}
