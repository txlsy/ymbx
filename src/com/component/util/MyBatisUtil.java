package com.component.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by Mark on 2015/5/27.
 */
public class MyBatisUtil {

    private static SqlSessionFactory sessionFactory;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("config/configuration.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private MyBatisUtil(){}

    public static SqlSession getSession(){
        return sessionFactory.openSession();
    }
}
