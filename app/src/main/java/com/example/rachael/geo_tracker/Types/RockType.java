package com.example.rachael.geo_tracker.Types;

public enum RockType {

    BASALT("Basalt", "A fine grained, dense, mafic extrusive igneous rock composed of crystals of olivine, feldspar, pyroxene and Fe-Ti oxides."),
    SANDSTONE("Sandstone", "A clastic sedimentary rock, composed of sand grade grains. Typically porous, composed of grains of quartz and feldspar."),
    MUDSTONE("Mudstone", "A clastic sedimentary rock, composed of clay grade grains. Typically low permeability, composed predominantly of clay minerals."),;

    private String rockType;
    private String rockTypeSummary;

    private RockType (String rockType, String rockTypeSummary){
        this.rockType = rockType;
        this.rockTypeSummary = rockTypeSummary;
    }

    public String getRockType() {
        return rockType;
    }

    public String getRockTypeSummary() {
        return rockTypeSummary;
    }
}
