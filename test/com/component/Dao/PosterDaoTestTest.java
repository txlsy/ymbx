package com.component.Dao;

import junit.framework.TestCase;

public class PosterDaoTestTest extends TestCase {

    private PosterDaoTest posterDaoTest;
    public void setUp() throws Exception {
        super.setUp();
        posterDaoTest = new PosterDaoTest();
    }

    public void testGetAll() throws Exception {
        assertEquals(8 , posterDaoTest.getAll().size());
    }
}