package com.component.interceptor;

import java.util.Map;

import com.component.model.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {

	private static final long serialVersionUID = 6201873385088758310L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("login interceptor destroy");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("login interceptor init");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("login interceptor invoke");
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		User user = (User) session.get("user");
		if(null == user) return Action.ERROR;
		else return invocation.invoke();
	}

}
