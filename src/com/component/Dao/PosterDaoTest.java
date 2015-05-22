package com.component.dao;

import com.component.dao.intf.PosterDao;
import com.component.model.Poster;
import com.component.util.DBUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 2015/5/20.
 */
public class PosterDaoTest extends BaseDao implements PosterDao {

    @Override
    public List<Poster> getAll() {
        String sql = "SELECT * FROM poster";
        List<Poster> list = null;
        try {
            connection = DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                if(null == list) list = new ArrayList<Poster>();
                Poster poster = new Poster();
                poster.setId(resultSet.getInt("id"));
                poster.setTitle(resultSet.getString("title"));
                poster.setImg(resultSet.getString("image"));
                poster.setAnime_id(resultSet.getInt("anime_id"));
                list.add(poster);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.release(resultSet,preparedStatement,connection);
        }
        return list;
    }
}
