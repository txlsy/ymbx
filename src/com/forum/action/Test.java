package com.forum.action;

import com.opensymphony.xwork2.ActionSupport;

public class Test extends ActionSupport {
	private static final long serialVersionUID = 2416340664575947009L;
	private int Test = 1 ;

	public int getTest() {
		return Test;
	}

	public void setTest(int test) {
		Test = test;
	}
}
