package com.component.common;

/**
 * Created by Mark on 2015/5/22.
 */
public interface IContainer {
    public IContainer getInstance();
    public <T> T getComponent(String id);
}