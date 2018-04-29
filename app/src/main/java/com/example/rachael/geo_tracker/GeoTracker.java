package com.example.rachael.geo_tracker;

import java.util.ArrayList;

public class GeoTracker {

    private ArrayList<GeoExcursion> geoExcursions;
    private ArrayList<GeoExcursion> completedGeoExcursions;
    private int counter;

    public GeoTracker(ArrayList<GeoExcursion> geoExcursions, int counter){
        this.geoExcursions = new ArrayList<>(geoExcursions);
        this.counter = counter;
        this.completedGeoExcursions = new ArrayList<>();
    }

    public ArrayList<GeoExcursion> getGeoExcursions() {
        return geoExcursions;
    }

    public void addGeoExcursions(GeoExcursion geoExcursionToAdd) {
        geoExcursions.add(geoExcursionToAdd);
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public ArrayList<GeoExcursion> getCompletedGeoExcursions() {
        return completedGeoExcursions;
    }

    public void addToCompletedGeoExcursions(GeoExcursion geoExcursion){
        completedGeoExcursions.add(geoExcursion);
        counter += 1;
    }

    public void removeCompletedGeoExcursion(GeoExcursion geoExcursion){
        completedGeoExcursions.remove(geoExcursion);
    }
}
