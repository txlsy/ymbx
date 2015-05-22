package com.component.dao;

import com.component.model.User;
import junit.framework.TestCase;

public class UserDaoTestTest extends TestCase {

    private UserDaoTest userDaoTest;
    public void setUp() throws Exception {
        super.setUp();
        userDaoTest = new UserDaoTest();
    }

    public void testGet() throws Exception {
        User user = userDaoTest.get("username", "lsy");
        assertEquals("123",user.getPassword());
    }

    public void testGetById() throws Exception {
        User user = userDaoTest.get("username", "lsy");
        assertEquals("123",user.getPassword());
    }
}