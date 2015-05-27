package com.component.Dao.anime;

import com.component.Dao.intf.AnimeDao;
import com.component.model.Anime;
import com.component.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Mark on 2015/5/27.
 */
public class AnimeDaoMyBatis implements AnimeDao {
    @Override
    public List<Anime> getAll() {
        return null;
    }

    @Override
    public Anime getAnimeById(int id) {
        SqlSession session = MyBatisUtil.getSession();
        Anime anime;
        try {
            anime = session.selectOne("com.component.Dao.anime.AnimeMapper.getAnimeById", id);
        } finally {
            session.close();
        }
        return anime;
    }
}
