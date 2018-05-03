package com.example.rachael.geo_tracker.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.rachael.geo_tracker.Adapters.CompletedExcursionAdaptor;
import com.example.rachael.geo_tracker.Adapters.ExcursionSeedAdapter;
import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.R;
import com.example.rachael.geo_tracker.SharedPreferences.SharedPreferencesHelper;

public class CompletedExcursionActivity extends AppCompatActivity {

    GeoExcursion completedGeoExcursionToAddToCompletedList;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_excursion);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));

        Intent intent = getIntent();
        completedGeoExcursionToAddToCompletedList = (GeoExcursion) intent.getSerializableExtra("completedGeoexcursion");

        GeoTracker geoTracker = SharedPreferencesHelper.loadApplicationState(this);
        SharedPreferencesHelper.saveApplicationState(this, geoTracker);

        // make new adaptor here
        CompletedExcursionAdaptor excursionNamesArrayAdapter = new CompletedExcursionAdaptor(this, geoTracker.getCompletedGeoExcursions());

        ListView excursionNamesListView = findViewById(R.id.completedListViewId);
        excursionNamesListView.setAdapter(excursionNamesArrayAdapter);

        TextView excursionsCompleted = findViewById(R.id.excursionCountertextViewId);
        String walksCompletedToString = "" + geoTracker.getWalksCompleted();
        String walksCompletedWithTitle = "Excursions Completed: " + walksCompletedToString;
        excursionsCompleted.setText(walksCompletedWithTitle);

        TextView excursionPointsCollected = findViewById(R.id.pointsCounterId);
        String pointsCollectedToString = ""+ geoTracker.getPointsCollected();
        String pointsCollectedWithTitle = "GeoTrax Points collected: "+ pointsCollectedToString;
        excursionPointsCollected.setText(pointsCollectedWithTitle);


    }

    public void onHomeButtonClicked(View button){
        Intent intent = new Intent(this, HomeActivity.class);

        startActivity(intent);
    }

}
