package com.example.rachael.geo_tracker;

import java.util.ArrayList;

public class GeoTracker {

    private ArrayList<GeoExcursion> geoExcursions;
    private ArrayList<GeoExcursion> completedGeoExcursions;
    private int walksCompleted;
    private int pointsCollected;

    public GeoTracker(ArrayList<GeoExcursion> geoExcursions, int walksCompleted, int pointsCollected){
        this.geoExcursions = new ArrayList<>(geoExcursions);
        this.walksCompleted = walksCompleted;
        this.pointsCollected = pointsCollected;
        this.completedGeoExcursions = new ArrayList<>();
    }

    public ArrayList<GeoExcursion> getGeoExcursions() {
        return geoExcursions;
    }

    public void addGeoExcursions(GeoExcursion geoExcursionToAdd) {
        geoExcursions.add(geoExcursionToAdd);
    }

    public int getWalksCompleted() {
        return walksCompleted;
    }

    public void setCounter(int counter) {
        this.walksCompleted = counter;
    }

    public int getPointsCollected() {
        return pointsCollected;
    }

    public ArrayList<GeoExcursion> getCompletedGeoExcursions() {
        return completedGeoExcursions;
    }

    public void addToCompletedGeoExcursions(GeoExcursion geoExcursion){
        completedGeoExcursions.add(geoExcursion);
        walksCompleted += 1;
        pointsCollected += geoExcursion.getExcursionType().getActivityPoints();
    }

    public void removeCompletedGeoExcursion(GeoExcursion geoExcursion){
        completedGeoExcursions.remove(geoExcursion);
    }
}
