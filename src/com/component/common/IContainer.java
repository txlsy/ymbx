package com.component.common;

/**
 * 容器 管理对象创建
 * Created by Mark on 2015/5/22.
 */
public interface IContainer {
    public Object getComponent(String id);
    public void setComponent(String id, Object o);
}