package com.component.Dao;

import com.component.Dao.intf.AnimeDao;
import com.component.model.Anime;
import com.component.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Mark on 2015/5/22.
 */
public class AnimeDaoTest extends BaseDao implements AnimeDao {

    @Override
    public List<Anime> getAll() {
        return null;
    }

    @Override
    public Anime getAnimeById(int id) {
        String sql = "SELECT * FROM anime WHERE id = ?";
        Anime anime = null;
        try {
            preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                anime = new Anime();
                anime.setId(resultSet.getInt("id"));
                anime.setTitle(resultSet.getString("title"));
                anime.setCover(resultSet.getString("cover"));
                anime.setYear(resultSet.getString("year"));
                anime.setSeason(resultSet.getString("season"));
                anime.setDecription(resultSet.getString("description"));
                anime.setStuff(resultSet.getString("stuff"));
                anime.setCast(resultSet.getString("cast"));
                anime.setType(resultSet.getInt("type"));
                anime.setUrl(resultSet.getString("url"));
                anime.setImage(resultSet.getString("image"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.release(resultSet,preparedStatement,null);
        }
        return anime;
    }
}
