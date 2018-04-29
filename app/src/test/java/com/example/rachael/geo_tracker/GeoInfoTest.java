package com.example.rachael.geo_tracker;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GeoInfoTest {

    GeoInfo geoInfo1;
    WayPoints waypoint1;
    RockType rocktype1;
    RockType rocktype2;
    ArrayList<RockType> rockList;

    @Before
    public void before(){
        rocktype1 = RockType.BASALT;
        rocktype2= RockType.SANDSTONE;
        rockList = new ArrayList<RockType>();
        rockList.add(rocktype1);
        rockList.add(rocktype2);
        waypoint1 = new WayPoints("Turn left at the fallen boulder");
        geoInfo1 = new GeoInfo("This is a test for geological info", rockList);

    }

    @Test
    public void geoInfoHasSummary(){
        assertEquals("This is a test for geological info", geoInfo1.getGeoInfoSummary());
    }

    @Test
    public void geoInfoHasRockTypes(){
        assertEquals(2, geoInfo1.getRockTypes().size());
    }

    @Test
    public void geoInfoRockTypeHasType(){
        assertEquals("Basalt", geoInfo1.getRockTypes().get(0).getRockType());
    }

    @Test
    public void wayPointHasDescription(){
        assertEquals("Turn left at the fallen boulder", waypoint1.getDescription());
    }




}
