package com.example.rachael.geo_tracker;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GeoExcursion {

    private String title;
    private ArrayList<GeoInfo> geologyInfo;
    private ArrayList<WayPoints> wayPoints;
    private ActivityType excursionType;

    public GeoExcursion (String title, ArrayList<GeoInfo> geologyInfo, ArrayList<WayPoints> wayPoints, ActivityType excursionType){
        this.title = title;
        this.geologyInfo = new ArrayList<>();
        this.wayPoints = new ArrayList<>();
        this.excursionType = excursionType;

    }

    public String getTitle() {
        return title;
    }

    public ArrayList<GeoInfo> getGeologyInfo() {
        return geologyInfo;
    }

    public ArrayList<WayPoints> getWayPoints() {
        return wayPoints;
    }


    public ActivityType getExcursionType() {
        return excursionType;
    }
}
