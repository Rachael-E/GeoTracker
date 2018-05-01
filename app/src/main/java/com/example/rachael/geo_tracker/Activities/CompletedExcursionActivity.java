package com.example.rachael.geo_tracker.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.R;
import com.example.rachael.geo_tracker.SharedPreferences.SharedPreferencesHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CompletedExcursionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_excursion);

        Intent intent = getIntent();
        GeoExcursion completedGeoExcursionToAddToCompletedList = (GeoExcursion) intent.getSerializableExtra("completedGeoexcursion");

        GeoTracker geoTracker = SharedPreferencesHelper.loadApplicationState(this);

        ExcursionSeedAdapter excursionNamesArrayAdapter = new ExcursionSeedAdapter(this, geoTracker.getCompletedGeoExcursions());

        ListView excursionNamesListView = findViewById(R.id.completedListViewId);
        excursionNamesListView.setAdapter(excursionNamesArrayAdapter);


    }
}
