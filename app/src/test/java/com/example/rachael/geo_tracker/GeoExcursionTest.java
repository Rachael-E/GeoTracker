package com.example.rachael.geo_tracker;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GeoActivityTest {

    GeoInfo geoInfo1;
    ArrayList<GeoInfo> geoInfoList;

    WayPoints waypoint1;
    WayPoints waypoint2;
    ArrayList<WayPoints> wayPointList;

    RockType rocktype1;
    RockType rocktype2;
    ArrayList<RockType> rockList;

    EraType eraType1;
    ArrayList<EraType> eraList;

    ActivityType activityType1;
    GeoExcursion geoExcursion1;

    @Before
    public void before(){
        rocktype1 = RockType.BASALT;
        rocktype2 = RockType.SANDSTONE;
        rockList = new ArrayList<RockType>();
        rockList.add(rocktype1);
        rockList.add(rocktype2);

        eraType1 = EraType.PALAEOGENE;
        eraList = new ArrayList<EraType>();
        eraList.add(eraType1);

        geoInfo1 = new GeoInfo(eraList, rockList);
        geoInfoList = new ArrayList<GeoInfo>();
        geoInfoList.add(geoInfo1);

        waypoint1 = new WayPoints("Turn left at the fallen boulder");
        waypoint2 = new WayPoints("Follow the path to the coastline");
        wayPointList = new ArrayList<WayPoints>();
        wayPointList.add(waypoint1);
        wayPointList.add(waypoint2);

        activityType1 = ActivityType.WALK;

        geoExcursion1 = new GeoExcursion("The Fossil Tree", geoInfoList, wayPointList, activityType1);

    }

    @Test
    public void geoExcursionHasTitle(){
        assertEquals("The Fossil Tree", geoExcursion1.getTitle());
    }


}
