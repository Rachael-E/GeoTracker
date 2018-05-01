package com.example.rachael.geo_tracker.Models;

import com.example.rachael.geo_tracker.Types.EraType;
import com.example.rachael.geo_tracker.Types.RockType;

import java.io.Serializable;
import java.util.ArrayList;

public class GeoInfo implements Serializable {

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

    public void setEraTypes(ArrayList<EraType> eraTypes) {
        this.eraTypes = eraTypes;
    }

    public void setRockTypes(ArrayList<RockType> rockTypes) {
        this.rockTypes = rockTypes;
    }
}
