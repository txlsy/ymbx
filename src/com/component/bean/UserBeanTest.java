package com.component.bean;

import com.component.Dao.UserDaoTest;
import com.component.Dao.intf.UserDao;
import com.component.bean.intf.UserBean;
import com.component.model.User;

public class UserBeanTest implements UserBean {

    private static UserDao userDao;

    static {
        userDao = new UserDaoTest();
    }

    public User getUser(int id){
        return userDao.get(id);
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
