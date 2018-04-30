package com.example.rachael.geo_tracker.Types;

public enum ExcursionType {

    WALK("Walking activity", 50),
    DRIVE("Drive-by", 10),;

    private String excursionType;
    private int excursionPoints;

    private ExcursionType (String excursionType, int excursionPoints){
        this.excursionType = excursionType;
        this.excursionPoints = excursionPoints;
    }

    public String getActivityType() {
        return excursionType;
    }

    public int getActivityPoints() {
        return excursionPoints;
    }
}
