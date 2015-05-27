package com.component.Dao.user;

import com.component.Dao.intf.UserDao;
import com.component.model.User;
import com.component.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Mark on 2015/5/27.
 */
public class UserDaoMyBatis implements UserDao {
    @Override
    public User getById(int id) {
        return get("id",id+"");
    }

    @Override
    public User getByName(String username) {
        User user;
        SqlSession session = MyBatisUtil.getSession();
        try {
            user = session.selectOne("com.component.Dao.user.UserMapper.get", username);
        } finally {
            session.close();
        }
        return user;
    }

    @Override
    public User get(String key, String value) {
        return null;
    }

    @Override
    public List<User> get(HashMap<String, String> params) {
        return null;
    }
}
