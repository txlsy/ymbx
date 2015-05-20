package com.component.util;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Created by Mark on 2015/5/20.
 */
public class DBUtil {
    private static String url = null;
    private static String username = null;
    private static String password = null;

    static {
        try {
            Properties properties = new Properties();
            String config = "config/db.properties";
            properties.load(DBUtil.class.getClassLoader().getResourceAsStream(config));
            String driver = properties.getProperty("jdbc.driver");
            url = properties.getProperty("jdbc.url");
            username = properties.getProperty("jdbc.username");
            password = properties.getProperty("jdbc.password");
            try {
                Class.forName(driver).newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, username, password);
    }

    public static void release(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection){
        try {
            if(resultSet!=null){
                resultSet.close();
            }
            if(preparedStatement!=null){
                preparedStatement.close();
            }
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
