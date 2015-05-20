package com.component.Dao.intf;

import com.component.model.User;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Mark on 2015/5/19.
 */
public interface UserDao {
    public User getById(int id);
    public User get(String key, String value);
    public List<User> get(HashMap<String, String> params);
}
