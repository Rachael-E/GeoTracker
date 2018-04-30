package com.example.rachael.geo_tracker;

import com.example.rachael.geo_tracker.SeedFile.GeoActivitySeed;

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
    public void Geo() {
        assertEquals(2, geoActivitySeed1.getList().size());
    }
}
