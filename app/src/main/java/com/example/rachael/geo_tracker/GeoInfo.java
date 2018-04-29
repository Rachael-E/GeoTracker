package com.example.rachael.geo_tracker;

import com.example.rachael.geo_tracker.Types.EraType;
import com.example.rachael.geo_tracker.Types.RockType;

import java.util.ArrayList;

public class GeoInfo {

    private ArrayList<EraType> eraTypes;
    private ArrayList<RockType> rockTypes;

    public GeoInfo (ArrayList<EraType> eraTypes, ArrayList<RockType> rockTypes){
        this.eraTypes = new ArrayList<>(eraTypes);
        this.rockTypes = new ArrayList<>(rockTypes);
    }

    public ArrayList<EraType> getEraTypes() {
        return eraTypes;
    }

    public ArrayList<RockType> getRockTypes() {
        return rockTypes;
    }
}
