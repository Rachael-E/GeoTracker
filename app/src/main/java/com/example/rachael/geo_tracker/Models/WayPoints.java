package com.example.rachael.geo_tracker.Models;

import java.io.Serializable;

public class WayPoints implements Serializable{

    private String description;

    public WayPoints (String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
