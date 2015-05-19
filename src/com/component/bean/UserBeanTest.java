package com.component.bean;

import com.component.bean.intf.UserBean;
import com.component.model.User;

public class UserBeanTest implements UserBean {

	@Override
	public User getUser(String key, String value) {
		//TODO select * from user where key = value
		return new User();
	}

	@Override
	public boolean isEqual(User a, User b) {
		return (a.getUsername().equals(b.getUsername()) && a.getPassword().equals(b.getPassword()));
	}

	@Override
	public boolean checkLogin(User loginUser) {
		//User getUser = getUser("username",loginUser.getUsername());
		//boolean isequal = isEqual(getUser,loginUser);
		return true;
	}

}
