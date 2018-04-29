package com.example.rachael.geo_tracker;

import com.example.rachael.geo_tracker.Types.ActivityType;
import com.example.rachael.geo_tracker.Types.EraType;
import com.example.rachael.geo_tracker.Types.RockType;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GeoExcursionTest {

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
    GeoExcursion geoExcursion2;
    ArrayList<GeoExcursion> geoExcursionList1;

    GeoTracker geoTracker1;

    @Before
    public void before(){
        rocktype1 = RockType.BASALT;
        rocktype2 = RockType.SANDSTONE;
        rockList = new ArrayList<>();
        rockList.add(rocktype1);
        rockList.add(rocktype2);

        eraType1 = EraType.PALAEOGENE;
        eraList = new ArrayList<>();
        eraList.add(eraType1);

        geoInfo1 = new GeoInfo(eraList, rockList);
        geoInfoList = new ArrayList<>();
        geoInfoList.add(geoInfo1);
//---------------------------------------------------------------------------------
        waypoint1 = new WayPoints("Turn left at the fallen boulder");
        waypoint2 = new WayPoints("Follow the path to the coastline");
        wayPointList = new ArrayList<>();
        wayPointList.add(waypoint1);
        wayPointList.add(waypoint2);

        activityType1 = ActivityType.WALK;

        geoExcursion1 = new GeoExcursion("The Fossil Tree", geoInfoList, wayPointList, activityType1);
        geoExcursion2 = new GeoExcursion("The Carsaig Arches", geoInfoList, wayPointList, activityType1);
        geoExcursionList1 = new ArrayList<>();
        geoExcursionList1.add(geoExcursion1);

        geoTracker1 = new GeoTracker(geoExcursionList1, 0, 0);



    }

    @Test
    public void geoExcursionHasTitle(){
        assertEquals("The Fossil Tree", geoExcursion1.getTitle());
    }

    @Test
    public void howManyInGeoInfoList(){
        assertEquals(1, geoInfoList.size());
        assertEquals("Basalt", geoInfoList.get(0).getRockTypes().get(0).getRockType());
    }

    @Test
    public void howManyInWayPointList(){
        assertEquals(2, wayPointList.size());
    }

    @Test
    public void geoExcursionHasWayPointList(){
        assertEquals(2, geoExcursion1.getWayPoints().size());
    }

    @Test
    public void geoExcursionHasActivityType(){
        assertEquals("Walking activity", geoExcursion1.getExcursionType().getActivityType());
    }

    @Test
    public void geoTrackerHasCount(){
        assertEquals(0, geoTracker1.getWalksCompleted());
    }

    @Test
    public void geoTrackerHasPoints(){
        assertEquals(0, geoTracker1.getPointsCollected());
    }

    @Test
    public void canSetCounter(){
        geoTracker1.setCounter(50);
        assertEquals(50, geoTracker1.getWalksCompleted());
    }

    @Test
    public void geoTrackerHasExcursion(){
        assertEquals(1, geoTracker1.getGeoExcursions().size());
    }

    @Test
    public void geoTrackerCanAddExcursion(){
        geoTracker1.addGeoExcursions(geoExcursion2);
        assertEquals(2, geoTracker1.getGeoExcursions().size());
    }

    @Test
    public void canAddToCompletedGeoExcursionInGeoTracker(){
        geoTracker1.addToCompletedGeoExcursions(geoExcursion1);
        geoTracker1.addToCompletedGeoExcursions(geoExcursion2);
        assertEquals(2, geoTracker1.getCompletedGeoExcursions().size());
        assertEquals(2, geoTracker1.getWalksCompleted());
        assertEquals(100, geoTracker1.getPointsCollected());

    }

    @Test
    public void canRemoveAnExcursionFromCompletedGeoExcursionsInGeoTracker(){
        geoTracker1.addToCompletedGeoExcursions(geoExcursion1);
        geoTracker1.removeCompletedGeoExcursion(geoExcursion1);
        assertEquals(0, geoTracker1.getCompletedGeoExcursions().size());
    }


}
