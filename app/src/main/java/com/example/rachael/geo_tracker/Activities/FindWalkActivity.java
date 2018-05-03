package com.example.rachael.geo_tracker.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.example.rachael.geo_tracker.Adapters.ExcursionSeedAdapter;
import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.R;
import com.example.rachael.geo_tracker.SeedFile.GeoActivitySeed;
import com.example.rachael.geo_tracker.SharedPreferences.SharedPreferencesHelper;

public class FindWalkActivity extends AppCompatActivity {

    ActionBar actionBar;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuHome:
                startActivity(new Intent(this, HomeActivity.class));
                return true;

            case R.id.menuAddExcursions:
                startActivity(new Intent(this, NewExcursionActivity.class));
                return true;

            case R.id.menuCompletedExcursions:
                startActivity(new Intent(this, CompletedExcursionActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_walk);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#838c6b")));


        //if geo tracker is completely new
        //TODO what happens if I add a walk in AddNewWalk though? Will the new walk be wiped and replaced with the seed?
//        GeoTracker geoTracker = new GeoTracker( GeoActivitySeed.seedEverything() , 0,0);

        GeoTracker geoTracker = SharedPreferencesHelper.loadApplicationState(this);

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
