package com.example.rachael.geo_tracker;

public enum EraType {

    QUATERNARY("Quaternary", 2),
    PALAEOGENE("Palaeogene", 66),
    CRETACEOUS("Cretaceous", 145),
    JURASSIC("Jurassic", 201),
    TRIASSIC("Triassic", 252),
    PERMIAN("Permian", 299),
    CARBONIFEROUS("Carboniferous", 359),;

    private String geologyPeriod;
    private int periodStartMYa;

    private EraType(String geologyPeriod, int periodStartMYa){
        this.geologyPeriod = geologyPeriod;
        this.periodStartMYa = periodStartMYa;
    }

    public String getGeologyPeriod() {
        return geologyPeriod;
    }

    public int getPeriodStartMYa() {
        return periodStartMYa;
    }
}
