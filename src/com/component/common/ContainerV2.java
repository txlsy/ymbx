package com.component.common;

import com.component.bean.PosterBeanTest;
import com.component.Dao.PosterDaoTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mark on 2015/5/23.
 */
public class ContainerV2 implements IContainer {
    private static ContainerV2 instance;
    private Map<String, Object> components;

    private ContainerV2(){
        components = new HashMap<String, Object>();
        components.put("posterBean", new PosterBeanTest());
        components.put("posterDao", new PosterDaoTest());
    }

    public static ContainerV2 getInstance() {
        if(null == instance) instance = new ContainerV2();
        return instance;
    }

    public Object getComponent(String id) {
        return components.get(id);
    }

    public void setComponent(String id, Object o){
        components.put(id, o);
    }
}
