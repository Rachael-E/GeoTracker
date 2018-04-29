package com.example.rachael.geo_tracker;

import java.util.ArrayList;

public class GeoInfo {

    private String geoInfoSummary;
    private ArrayList<RockType> rockTypes;

    public GeoInfo (String geoInfoSummary, ArrayList<RockType> rockTypes){
        this.geoInfoSummary = geoInfoSummary;
        this.rockTypes = new ArrayList<>(rockTypes);
    }

    public String getGeoInfoSummary() {
        return geoInfoSummary;
    }

    public ArrayList<RockType> getRockTypes() {
        return rockTypes;
    }
}
