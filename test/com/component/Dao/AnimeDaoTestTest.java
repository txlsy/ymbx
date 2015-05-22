package com.component.dao;

import com.component.model.Anime;
import junit.framework.TestCase;

public class AnimeDaoTestTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void testGetAnimeById() throws Exception {
        AnimeDaoTest animeDaoTest = new AnimeDaoTest();
        Anime anime = animeDaoTest.getAnimeById(1);
        assertEquals("cast",anime.getCast());
    }
}