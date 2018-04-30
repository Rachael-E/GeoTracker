package com.example.rachael.geo_tracker.SeedFile;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoInfo;
import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.Types.ActivityType;
import com.example.rachael.geo_tracker.Models.WayPoints;
import com.example.rachael.geo_tracker.Types.EraType;
import com.example.rachael.geo_tracker.Types.RockType;

import java.util.ArrayList;

public class GeoActivitySeed {


    private ArrayList<GeoInfo> geoInfoFossil, geoInfoArches;
    private ArrayList<WayPoints> wayPointsFossil, wayPointsArches;
    private ArrayList<GeoExcursion> list;


    public GeoActivitySeed() {

        RockType rocktype1 = RockType.BASALT;
        RockType rocktype2 = RockType.SANDSTONE;
        ArrayList<RockType> rockListFossil = new ArrayList<>();
        ArrayList<RockType> rockListArches = new ArrayList<>();
        rockListFossil.add(rocktype1);
        rockListArches.add(rocktype2);
        rockListArches.add(rocktype1);

        EraType eraType1 = EraType.PALAEOGENE;
        EraType eraType2 = EraType.JURASSIC;
        EraType eraType3 = EraType.TRIASSIC;
        ArrayList<EraType> eraListFossil = new ArrayList<>();
        ArrayList<EraType> eraListArches = new ArrayList<>();
        eraListFossil.add(eraType1);
//        eraListArches.add(eraType1, eraType2, eraType3);
        eraListArches.add(eraType1);
        eraListArches.add(eraType2);
        eraListArches.add(eraType3);

        GeoInfo geoInfoFossil = new GeoInfo(eraListFossil, rockListFossil);
        GeoInfo geoInfoArches = new GeoInfo(eraListArches, rockListArches);
        ArrayList<GeoInfo> geoInfoListFossil = new ArrayList<>();
        ArrayList<GeoInfo> geoInfoListArches = new ArrayList<>();
        geoInfoListFossil.add(geoInfoFossil);
        geoInfoListArches.add(geoInfoArches);
//---------------------------------------------------------------------------------
        WayPoints waypoint1 = new WayPoints("Turn left at the fallen boulder by the Oak Tree");
        WayPoints waypoint2 = new WayPoints("Follow the path to the coastline");
        WayPoints waypoint3 = new WayPoints("Descend the rusty iron ladder to the pebble beach below. Don't worry, it's quite safe!");
        ArrayList<WayPoints> wayPointListFossil = new ArrayList<>();
        ArrayList<WayPoints> wayPointListArches = new ArrayList<>();
        wayPointListFossil.add(waypoint1);
        wayPointListFossil.add(waypoint3);
        wayPointListArches.add(waypoint1);
        wayPointListArches.add(waypoint2);

        ActivityType activityTypeFossil = ActivityType.WALK;
        ActivityType activityTypeArches = ActivityType.WALK;

        list = new ArrayList<>();
        list.add(new GeoExcursion("The Fossil Tree", geoInfoListFossil, wayPointsFossil, activityTypeFossil, false));
        list.add(new GeoExcursion("The Carsaig Arches", geoInfoListArches, wayPointsArches, activityTypeArches, false));

    }

    public ArrayList<GeoExcursion> getList() {
        return new ArrayList<>(list);
    }


}
