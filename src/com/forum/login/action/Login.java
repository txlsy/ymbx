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
	private static UserBean userBean;
	private Map<String, Object> session;

    static {
        userBean = new UserBeanTest();
    }

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public String execute(){
		String m = ServletActionContext.getRequest().getMethod();
        if(m.equalsIgnoreCase("post")) {
            if (userBean.checkLogin(user)) {
                session.put("user", user);
            } else return ERROR;
        }
        return "index";
	}
}
