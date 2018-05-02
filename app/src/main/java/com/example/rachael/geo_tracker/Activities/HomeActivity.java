package com.example.rachael.geo_tracker.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
    //GeoTracker geoTracker;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_home, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.actionMenu) {

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findWalkButton = findViewById(R.id.findAWalkButtonId);
        completedWalkButton = findViewById(R.id.viewCompletedWalksButtonId);
        newWalkButton = findViewById(R.id.createNewWalkButtonId);


//        SharedPreferencesHelper.deleteApplicationState(this);
//      //go to SharedPref to get the existing geoTracker
        GeoTracker geoTracker = SharedPreferencesHelper.loadApplicationState(this);
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



