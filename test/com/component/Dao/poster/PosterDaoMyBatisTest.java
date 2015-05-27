package com.component.Dao.poster;

import com.component.model.Poster;
import junit.framework.TestCase;

import java.util.List;

public class PosterDaoMyBatisTest extends TestCase {

    public void testGetAll() throws Exception {
        PosterDaoMyBatis p = new PosterDaoMyBatis();
        List<Poster> l = p.getAll();
        assertEquals(8,l.size());
    }
}