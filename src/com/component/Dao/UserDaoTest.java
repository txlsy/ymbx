package com.component.Dao;

import com.component.Dao.intf.UserDao;
import com.component.model.User;
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

    private static Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    static {
//        String config = "../config/db.properties";
//        String path = ServletActionContext.getServletContext().getRealPath("db.properties");
//        Properties properties = new Properties();
//        try {
//            properties.load(new FileInputStream(path));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String driver = properties.getProperty("jdbc.driver");
//        String url = properties.getProperty("jdbc.url");
//        String username = properties.getProperty("jdbc.username");
//        String password = properties.getProperty("jdbc.password");
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ymbx","root","123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User get(int id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return get("id",id+"");
    }

    @Override
    public User get(String key, String value) {
        String sql = "SELECT * FROM user WHERE "+key+" = ?";
        User user = null;
        try {
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
        }
        return user;
    }

    @Override
    public List<User> get(HashMap<String, String> params) {
        return null;
    }

    @Override
    public void close() {
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(preparedStatement!=null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
