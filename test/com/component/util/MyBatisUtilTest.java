package com.component.util;

import junit.framework.TestCase;

public class MyBatisUtilTest extends TestCase {

    public void testGetSession() throws Exception {
        assertNotNull(MyBatisUtil.getSession());
    }
}