package com.example.rachael.geo_tracker.Types;

public enum ActivityType {

    WALK("Walking activity", 50),
    DRIVE("Drive-by", 10),;

    private String activityType;
    private int activityPoints;

    private ActivityType (String activityType, int activityPoints){
        this.activityType = activityType;
        this.activityPoints = activityPoints;
    }

    public String getActivityType() {
        return activityType;
    }

    public int getActivityPoints() {
        return activityPoints;
    }
}
