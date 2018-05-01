package com.example.rachael.geo_tracker.Models;

import com.example.rachael.geo_tracker.Types.ExcursionType;

import java.io.Serializable;
import java.util.ArrayList;

public class GeoExcursion implements Serializable {

    private String title;
    private String summary;
    private ArrayList<GeoInfo> geologyInfo;
    private ArrayList<WayPoints> wayPoints;
    private ExcursionType excursionType;
    private boolean isComplete;

    public GeoExcursion(String title, String summary, ArrayList<GeoInfo> geologyInfo, ArrayList<WayPoints> wayPoints, ExcursionType excursionType, boolean isComplete) {
        this.title = title;
        this.summary = summary;
        this.geologyInfo = geologyInfo;
//        this.geologyInfo = new ArrayList<>(geologyInfo);
        this.wayPoints = wayPoints;
        this.excursionType = excursionType;
        this.isComplete = isComplete;

    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
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

    public void setWayPoints(ArrayList<WayPoints> wayPoints) {
        this.wayPoints = wayPoints;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setGeologyInfo(ArrayList<GeoInfo> geologyInfo) {
        this.geologyInfo = geologyInfo;
    }

    public void setExcursionType(ExcursionType excursionType) {
        this.excursionType = excursionType;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
