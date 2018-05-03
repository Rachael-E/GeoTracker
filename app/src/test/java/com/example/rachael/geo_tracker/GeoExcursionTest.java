package com.example.rachael.geo_tracker;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoInfo;
import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.Models.WayPoints;
import com.example.rachael.geo_tracker.Types.EraType;
import com.example.rachael.geo_tracker.Types.ExcursionType;
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

//    RockType rocktype1;
//    RockType rocktype2;
//    ArrayList<RockType> rockList;
//
//    EraType eraType1;
//    ArrayList<EraType> eraList;

//    ActivityType activityType1;

    GeoExcursion geoExcursion1;
    GeoExcursion geoExcursion2;
    ArrayList<GeoExcursion> geoExcursionList1;

    GeoTracker geoTracker1;

    @Before
    public void before(){
        RockType rocktype1 = RockType.BASALT;
        RockType rocktype2 = RockType.SANDSTONE;
        ArrayList<RockType> rockList = new ArrayList<>();
        rockList.add(rocktype1);
        rockList.add(rocktype2);

        EraType eraType1 = EraType.PALAEOGENE;
        EraType eraType2 = EraType.JURASSIC;
        ArrayList<EraType>eraList = new ArrayList<>();
        eraList.add(eraType1);
        eraList.add(eraType2);

        geoInfo1 = new GeoInfo(eraList, rockList);
        geoInfoList = new ArrayList<>();
        geoInfoList.add(geoInfo1);
//---------------------------------------------------------------------------------
        waypoint1 = new WayPoints("Turn left at the fallen boulder");
        waypoint2 = new WayPoints("Follow the path to the coastline");
        wayPointList = new ArrayList<>();
        wayPointList.add(waypoint1);
        wayPointList.add(waypoint2);

        ExcursionType activityType1 = ExcursionType.WALK;

        geoExcursion1 = new GeoExcursion("The Fossil Tree", "bla", geoInfoList, wayPointList, activityType1, false);
        geoExcursion2 = new GeoExcursion("The Carsaig Arches", "bla", geoInfoList, wayPointList, activityType1, false);
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
    public void canGetCompleteStatus(){
        assertEquals(false, geoExcursion1.getCompleteStatus());
    }

    @Test
    public void canSetCompleteStatusToTrue(){
        geoExcursion1.setCompleteToTrue();
        assertEquals(true, geoExcursion1.getCompleteStatus());
    }

    @Test
    public void canGetEraTypeSize(){
        assertEquals(2 ,geoExcursion1.getGeologyInfo().get(0).getEraTypes().size());
    }

    @Test
    public void canGetEraTypeNames(){
//        assertEquals("Geological Periods: Palaeogene, Jurassic" ,geoExcursion1.getGeologyInfo().get(0).getEraTypeNames());
        assertEquals("Geological Periods: Palaeogene, Jurassic" ,geoExcursion1.getNameOfPeriodInGeologyInfo());
    }

    @Test
    public void canGetRockTypeNames(){
        assertEquals("Rock types: Basalt, Sandstone", geoExcursion1.getNameOfRockTypesInGeologyInfo());
    }




}
