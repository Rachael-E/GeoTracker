package com.example.rachael.geo_tracker.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.rachael.geo_tracker.Adapters.CompletedExcursionAdaptor;
import com.example.rachael.geo_tracker.Adapters.ExcursionSeedAdapter;
import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.R;
import com.example.rachael.geo_tracker.SharedPreferences.SharedPreferencesHelper;

public class CompletedExcursionActivity extends AppCompatActivity {

    GeoExcursion completedGeoExcursionToAddToCompletedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_excursion);

        Intent intent = getIntent();
        completedGeoExcursionToAddToCompletedList = (GeoExcursion) intent.getSerializableExtra("completedGeoexcursion");

        GeoTracker geoTracker = SharedPreferencesHelper.loadApplicationState(this);

        // make new adaptor here
        CompletedExcursionAdaptor excursionNamesArrayAdapter = new CompletedExcursionAdaptor(this, geoTracker.getCompletedGeoExcursions());

        ListView excursionNamesListView = findViewById(R.id.completedListViewId);
        excursionNamesListView.setAdapter(excursionNamesArrayAdapter);


    }
}
