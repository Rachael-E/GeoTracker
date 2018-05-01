package com.example.rachael.geo_tracker.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.rachael.geo_tracker.Adapters.ExcursionSeedAdapter;
import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.R;
import com.example.rachael.geo_tracker.SeedFile.GeoActivitySeed;
import com.example.rachael.geo_tracker.SharedPreferences.SharedPreferencesHelper;

public class FindWalkActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_walk);


        //if geo tracker is completely new
        GeoTracker geoTracker = new GeoTracker( GeoActivitySeed.seedEverything() , 0,0);

        SharedPreferencesHelper.loadApplicationState(this);

        SharedPreferencesHelper.saveApplicationState(this, geoTracker);

        ExcursionSeedAdapter excursionAdapter = new ExcursionSeedAdapter(this, geoTracker.getGeoExcursions());

        ListView listView = findViewById(R.id.findWalkListViewId);
        listView.setAdapter(excursionAdapter);
    }

    public void onListItemClick(View listItem){
        GeoExcursion geoExcursion = (GeoExcursion) listItem.getTag();

        Intent intent = new Intent(this, ExcursionDetailActivity.class);
        intent.putExtra("geoexcursion", geoExcursion);
        startActivity(intent);
    }
}
