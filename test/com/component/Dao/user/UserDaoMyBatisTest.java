package com.component.Dao.user;

import com.component.model.User;
import junit.framework.TestCase;

public class UserDaoMyBatisTest extends TestCase {

    public void testGet() throws Exception {
        UserDaoMyBatis u = new UserDaoMyBatis();
        User user = u.get("username", "lsy");
        assertEquals("123",user.getPassword());
    }
}