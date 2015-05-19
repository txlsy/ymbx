package com.forum.article.action;

import com.forum.action.BaseAction;

public class Article extends BaseAction {
	private static final long serialVersionUID = 7615122777099350212L;
	private String test = "filter test";
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
}
