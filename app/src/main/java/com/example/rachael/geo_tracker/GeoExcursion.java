package com.example.rachael.geo_tracker;

import java.util.ArrayList;

public class GeoExcursion {

    private String title;
    private ArrayList<GeoInfo> geologyInfo;
    private ArrayList<WayPoints> wayPoints;
    private ActivityType activityType;

    public GeoExcursion (String title, ArrayList<GeoInfo> geologyInfo, ArrayList<WayPoints> wayPoints, ActivityType activityType){
        this.title = title;
        this.geologyInfo = new ArrayList<GeoInfo>();
        this.wayPoints = new ArrayList<WayPoints>();
        this.activityType = activityType;

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


    public ActivityType getActivityType() {
        return activityType;
    }
}
