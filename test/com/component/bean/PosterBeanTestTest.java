package com.component.bean;

import junit.framework.TestCase;

public class PosterBeanTestTest extends TestCase {

    public void testGetIndexPosts() throws Exception {
        PosterBeanTest posterBeanTest = new PosterBeanTest();
        assertEquals(8,posterBeanTest.getIndexPosts().size());
    }
}