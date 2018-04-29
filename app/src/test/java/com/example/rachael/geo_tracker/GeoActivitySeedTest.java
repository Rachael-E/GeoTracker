package com.example.rachael.geo_tracker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeoActivitySeedTest {

    GeoActivitySeed geoActivitySeed1;

    @Before
    public void before() {
        geoActivitySeed1 = new GeoActivitySeed();
    }

    @Test
    public void test() {
        assertEquals(1, geoActivitySeed1.getList());
    }
}
