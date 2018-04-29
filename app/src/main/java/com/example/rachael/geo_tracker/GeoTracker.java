package com.example.rachael.geo_tracker;

import java.util.ArrayList;

public class GeoTracker {

    private ArrayList<GeoExcursion> geoExcursions;
    private int counter;

    public GeoTracker(ArrayList<GeoExcursion> geoExcursions, int counter){
        this.geoExcursions = new ArrayList<>(geoExcursions);
        this.counter = counter;
    }

    public ArrayList<GeoExcursion> getGeoExcursions() {
        return geoExcursions;
    }

    public int getCounter() {
        return counter;
    }
}
