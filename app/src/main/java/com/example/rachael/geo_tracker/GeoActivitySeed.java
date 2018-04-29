package com.example.rachael.geo_tracker;

import com.example.rachael.geo_tracker.Types.ActivityType;

import java.util.ArrayList;

public class GeoActivitySeed {


    private ArrayList<GeoInfo> geoInfoFossil;
    private ArrayList<GeoInfo> geoInfoArches;
    private ArrayList<WayPoints> wayPointsFossil;
    private ArrayList<WayPoints> wayPointsArches;
    private ActivityType activityTypeFossil;
    private ActivityType activityTypeArches;

    private ArrayList<GeoExcursion> list;


    public GeoActivitySeed() {
        list = new ArrayList<>();
        list.add(new GeoExcursion("The Fossil Tree", geoInfoFossil, wayPointsFossil, activityTypeFossil));
        list.add(new GeoExcursion("The Carsaig Arches", geoInfoArches, wayPointsArches, activityTypeArches));

    }

    public ArrayList<GeoExcursion> getList() {
        return new ArrayList<>(list);
    }
}
