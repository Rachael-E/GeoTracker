package com.example.rachael.geo_tracker.Types;

public enum EraType {

    QUATERNARY("Quaternary", "Max. age 2.8MYa"),
    PALAEOGENE("Palaeogene", "Max. age 66MYa"),
    CRETACEOUS("Cretaceous", "Max. age 145MYa"),
    JURASSIC("Jurassic", "Max. age 201MYa"),
    TRIASSIC("Triassic", "Max. age 252MYa"),
    PERMIAN("Permian", "Max. age 299MYa"),
    CARBONIFEROUS("Carboniferous", "Max. age 359MYa"),;

    private String geologyPeriod;
    private String periodStartMYa;

    private EraType(String geologyPeriod, String periodStartMYa){
        this.geologyPeriod = geologyPeriod;
        this.periodStartMYa = periodStartMYa;
    }

    public String getGeologyPeriod() {
        return geologyPeriod;
    }

    public String getPeriodStartMYa() {
        return periodStartMYa;
    }

    public void setGeologyPeriod(String geologyPeriod) {
        this.geologyPeriod = geologyPeriod;
    }

    public void setPeriodStartMYa(String periodStartMYa) {
        this.periodStartMYa = periodStartMYa;
    }
}
