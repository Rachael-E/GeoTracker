package com.example.rachael.geo_tracker;

import com.example.rachael.geo_tracker.Types.ActivityType;

import java.util.ArrayList;

public class GeoExcursion {

    private String title;
    private ArrayList<GeoInfo> geologyInfo;
    private ArrayList<WayPoints> wayPoints;
    private ActivityType excursionType;

    public GeoExcursion (String title, ArrayList<GeoInfo> geologyInfo, ArrayList<WayPoints> wayPoints, ActivityType excursionType){
        this.title = title;
        this.geologyInfo = new ArrayList<>(geologyInfo);
        this.wayPoints = new ArrayList<>(wayPoints);
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
