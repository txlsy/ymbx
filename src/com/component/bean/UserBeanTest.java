package com.component.bean;

import com.component.Dao.UserDaoTest;
import com.component.Dao.intf.UserDao;
import com.component.bean.intf.UserBean;
import com.component.model.User;
import com.opensymphony.xwork2.inject.Inject;

public class UserBeanTest implements UserBean {

    @Inject(value = "userDao")
    private UserDao userDao;

    public User getUserById(int id){
        return userDao.getById(id);
    }

    public User getUserByName(String username){return userDao.getByName(username); }

    @Deprecated
	public User getUser(String key, String value) {
		return userDao.get(key,value);
	}

	public boolean isEqual(User a, User b) {
		return (a.getUsername().equals(b.getUsername()) && a.getPassword().equals(b.getPassword()));
	}

	public boolean checkLogin(User loginUser) {
		User getUser = getUserByName(loginUser.getUsername());
		boolean isEqual = isEqual(getUser,loginUser);
		return isEqual;
	}

}
