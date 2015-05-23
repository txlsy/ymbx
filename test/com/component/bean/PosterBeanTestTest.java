package com.component.bean;

import com.component.common.Container;
import junit.framework.TestCase;

public class PosterBeanTestTest extends TestCase {

    public void testGetIndexPosts() throws Exception {
        PosterBeanTest posterBeanTest = new PosterBeanTest();
        assertEquals(8,posterBeanTest.getIndexPosts().size());
    }

    public void testGetIndexPostsWithContainer() throws Exception {
        PosterBeanTest posterBeanTest = (PosterBeanTest) Container.getInstance().getComponent("posterBean");
        assertEquals(8,posterBeanTest.getIndexPosts().size());
    }
}