package com.component.bean;

import com.component.dao.UserDaoTest;
import com.component.dao.intf.UserDao;
import com.component.bean.intf.UserBean;
import com.component.model.User;

public class UserBeanTest implements UserBean {

    private static UserDao userDao;

    static {
        userDao = new UserDaoTest();
    }

    public User getUserById(int id){
        return userDao.getById(id);
    }

	public User getUser(String key, String value) {
		return userDao.get(key,value);
	}

	public boolean isEqual(User a, User b) {
		return (a.getUsername().equals(b.getUsername()) && a.getPassword().equals(b.getPassword()));
	}

	public boolean checkLogin(User loginUser) {
		User getUser = getUser("username",loginUser.getUsername());
		boolean isEqual = isEqual(getUser,loginUser);
		return isEqual;
	}

}
