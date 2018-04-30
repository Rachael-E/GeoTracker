package com.example.rachael.geo_tracker.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.R;
import com.example.rachael.geo_tracker.SeedFile.GeoActivitySeed;

import java.util.ArrayList;

public class FindWalkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_walk);

        GeoActivitySeed excursions = new GeoActivitySeed();
        ArrayList<GeoExcursion> excursionList = excursions.getList();
    }
}
