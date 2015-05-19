package com.forum.login.action;

import java.util.Map;

import com.forum.action.BaseAction;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.component.bean.UserBeanTest;
import com.component.bean.intf.UserBean;
import com.component.model.User;

public class Login extends BaseAction implements SessionAware {
	private static final long serialVersionUID = -9202928079222902936L;
	private User user;
	private UserBean userBean;
	private Map<String, Object> session;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public String execute(){
		String m = ServletActionContext.getRequest().getMethod();
		System.out.println(m);
		userBean = new UserBeanTest();
		if(userBean.checkLogin(user)){
			session.put("user", user);
			return "index";
		}
		else return ERROR;
	}
}
