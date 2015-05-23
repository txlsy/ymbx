package com.component.common;

import com.component.bean.PosterBeanTest;
import com.component.bean.intf.PosterBean;
import com.component.dao.PosterDaoTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mark on 2015/5/23.
 */
public class Container implements IContainer {
    private static Container instance;
    private Map<String, Object> components;

    private Container(){
        components = new HashMap<String, Object>();
        components.put("posterBean", new PosterBeanTest());
        components.put("posterDao", new PosterDaoTest());
    }

    public static Container getInstance() {
        if(null == instance) instance = new Container();
        return instance;
    }

    public Object getComponent(String id) {
        return components.get(id);
    }

    public void setComponent(String id, Object o){
        components.put(id, o);
    }
}
