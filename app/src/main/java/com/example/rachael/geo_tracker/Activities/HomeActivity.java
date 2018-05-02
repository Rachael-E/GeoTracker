package com.example.rachael.geo_tracker.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.R;
import com.example.rachael.geo_tracker.SeedFile.GeoActivitySeed;
import com.example.rachael.geo_tracker.SharedPreferences.SharedPreferencesHelper;

public class HomeActivity extends AppCompatActivity {

    Button findWalkButton;
    Button completedWalkButton;
    Button newWalkButton;
    GeoTracker geoTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findWalkButton = findViewById(R.id.findAWalkButtonId);
        completedWalkButton = findViewById(R.id.viewCompletedWalksButtonId);
        newWalkButton = findViewById(R.id.createNewWalkButtonId);
//      //go to SharedPref to get the existing geoTracker
        geoTracker = SharedPreferencesHelper.loadApplicationState(this);
//        if it's null create a new GeoTracker
        if(geoTracker == null){
            geoTracker = new GeoTracker( GeoActivitySeed.seedEverything() , 0,0);
            SharedPreferencesHelper.saveApplicationState(this, geoTracker);
        }


    }


    public void onFindExcursionButtonClicked(View button){
        Log.d(getClass().toString(), "onFindWalkButton was called");

        Intent intent = new Intent( this, FindWalkActivity.class);

//        intent.putExtra("excursions", excursions);
        startActivity(intent);
    }

    public void onCompletedButtonClicked(View button){

        Intent intent = new Intent(this, CompletedExcursionActivity.class);

        startActivity(intent);
    }

    public void onNewExcursionButtonClicked(View button){

        Intent intent = new Intent(this, NewExcursionActivity.class);

        startActivity(intent);
    }
}



