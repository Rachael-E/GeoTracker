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

    public String getEraTypeNames() {
        String eraNames = "Geological Periods:\n";

        for (EraType era: getEraTypes()) {
            eraNames += era.getGeologyPeriod() + ", ";
        }

        String eraNamesNeat = eraNames.substring(0, eraNames.length() -2);
        return eraNamesNeat;

    }

    public ArrayList<RockType> getRockTypes() {
        return rockTypes;
    }

    public String getRockTypeNames() {
        String rockNames = "Rock types:\n";

        for (RockType rock: getRockTypes()) {
            rockNames += rock.getRockType() + ", ";
        }

        String rockNamesNeat = rockNames.substring(0, rockNames.length() -2);
        return rockNamesNeat;
    }

    public void setEraTypes(ArrayList<EraType> eraTypes) {
        this.eraTypes = eraTypes;
    }

    public void setRockTypes(ArrayList<RockType> rockTypes) {
        this.rockTypes = rockTypes;
    }
}
