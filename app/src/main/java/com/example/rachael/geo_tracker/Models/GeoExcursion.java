package com.example.rachael.geo_tracker.Models;

import com.example.rachael.geo_tracker.Types.ExcursionType;

import java.util.ArrayList;

public class GeoExcursion {

    private String title;
    private ArrayList<GeoInfo> geologyInfo;
    private ArrayList<WayPoints> wayPoints;
    private ExcursionType excursionType;
    private boolean isComplete;

    public GeoExcursion(String title, ArrayList<GeoInfo> geologyInfo, ArrayList<WayPoints> wayPoints, ExcursionType excursionType, boolean isComplete) {
        this.title = title;
        this.geologyInfo = geologyInfo;
//        this.geologyInfo = new ArrayList<>(geologyInfo);
        this.wayPoints = wayPoints;
        this.excursionType = excursionType;
        this.isComplete = isComplete;

    }

    public String getTitle() {
        return title;
    }

    public boolean getCompleteStatus() {
        return isComplete;
    }

    public void setCompleteToFalse() {
        isComplete = false;
    }


    public void setCompleteToTrue() {
        isComplete = true;
    }

    public ArrayList<GeoInfo> getGeologyInfo() {
        return geologyInfo;
    }

    public ArrayList<WayPoints> getWayPoints() {
        return wayPoints;
    }

    public ExcursionType getExcursionType() {
        return excursionType;
    }

    // set waypoints for when newing up a walk
//    public void setWayPoints(ArrayList<WayPoints> wayPoints) {
//        this.wayPoints = wayPoints;
//    }
}
