package com.forum.reg.action;

import com.component.model.User;
import com.forum.action.BaseAction;

public class Register extends BaseAction {

	private static final long serialVersionUID = -4861149590278142528L;
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute(){
		
		return SUCCESS;
	}
}
