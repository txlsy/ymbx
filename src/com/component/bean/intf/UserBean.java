package com.component.bean.intf;

import com.component.model.User;

public interface UserBean {

	/**
	 * 比较两个用户是不是同一个
	 * 比较规则：用户名（username）和密码（password）
	 * 两个属性都相同即表示同一个用户
	 * @param user
	 * @return 同一个返回true，不同返回false
	 */
	public boolean isEqual(User a, User b);
	/**
	 * 根据给定的用户属性和值查找用户
	 * 例如：key为username，值为lsy
	 * 则表示查找用户名为lsy的这个用户
	 * @param key 用户属性
	 * @param value 给定属性的值
	 * @return 返回一个用户
	 */
	public User getUser(String key, String value);
	/**
	 * 检验用户是否登陆成功
	 * @param user
	 * @return 成功返回true
	 */
	public boolean checkLogin(User loginUser);
}
