package com.component.Dao;

import com.component.Dao.intf.UserDao;
import com.component.model.User;
import com.component.util.DBUtil;
import org.apache.struts2.ServletActionContext;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

/**
 * Created by Mark on 2015/5/19.
 */
public class UserDaoTest implements UserDao {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    @Override
    public User getById(int id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return get("id",id+"");
    }

    @Override
    public User get(String key, String value) {
        String sql = "SELECT * FROM user WHERE "+key+" = ?";
        User user = null;
        try {
            connection = DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, value);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setEmal(resultSet.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.release(resultSet,preparedStatement,connection);
        }
        return user;
    }

    @Override
    public List<User> get(HashMap<String, String> params) {
        return null;
    }

}
