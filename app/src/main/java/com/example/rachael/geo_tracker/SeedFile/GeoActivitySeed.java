package com.example.rachael.geo_tracker.SeedFile;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoInfo;
import com.example.rachael.geo_tracker.Types.ActivityType;
import com.example.rachael.geo_tracker.Models.WayPoints;

import java.util.ArrayList;

public class GeoActivitySeed {


    private ArrayList<GeoInfo> geoInfoFossil, geoInfoArches;
//    private ArrayList<GeoInfo> geoInfoArches;
    private ArrayList<WayPoints> wayPointsFossil, wayPointsArches;
//    private ArrayList<WayPoints> wayPointsArches;
    private ActivityType activityTypeFossil, activityTypeArches;
//    private ActivityType activityTypeArches;

    private ArrayList<GeoExcursion> list;


    public GeoActivitySeed() {
        list = new ArrayList<>();
        list.add(new GeoExcursion("The Fossil Tree", geoInfoFossil, wayPointsFossil, activityTypeFossil, false));
        list.add(new GeoExcursion("The Carsaig Arches", geoInfoArches, wayPointsArches, activityTypeArches, false));

    }

    public ArrayList<GeoExcursion> getList() {
        return new ArrayList<>(list);
    }


}
