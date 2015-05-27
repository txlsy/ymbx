package com.component.Dao.poster;

import com.component.Dao.intf.PosterDao;
import com.component.model.Poster;
import com.component.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Mark on 2015/5/27.
 */
public class PosterDaoMyBatis implements PosterDao {
    @Override
    public List<Poster> getAll() {
        SqlSession session = MyBatisUtil.getSession();
        List<Poster> list;
        try {
            list = session.selectList("com.component.Dao.poster.PosterMapper.getAll");
        } finally {
            session.close();
        }
        return list;
    }
}
