package com.example.rachael.geo_tracker.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.rachael.geo_tracker.Adapters.WayPointAdapter;
import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.R;
import com.example.rachael.geo_tracker.SharedPreferences.SharedPreferencesHelper;

public class ExcursionDetailActivity extends AppCompatActivity {

    GeoExcursion geoExcursion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excursion_detail);

        Intent intent = getIntent();
        geoExcursion = (GeoExcursion) intent.getSerializableExtra("geoexcursion");

        // Gets the title of the excursion //
        TextView excursionTitleTextView = findViewById(R.id.excursionDetailTitleTextViewId);
        excursionTitleTextView.setText(geoExcursion.getTitle());

        // Gets the geological period names of each EraType item within the GeoInfo ArrayList //
        TextView excursionEraTextView = findViewById(R.id.eraTypeTextViewId);
        String returnGeologyPeriodNames = geoExcursion.getNameOfPeriodInGeologyInfo();
        excursionEraTextView.setText(returnGeologyPeriodNames);

        // Get the rock names of each RockType item within the GeoInfo ArrayList //
        TextView excursionRockTextView = findViewById(R.id.rockTypeTextViewId);
        String getFirstRockType = geoExcursion.getNameOfRockTypesInGeologyInfo();
        excursionRockTextView.setText(getFirstRockType);

        // Get the Activity Type of the excursion //
        TextView excursionType = findViewById(R.id.excursionDetailTypeTextViewId);
        excursionType.setText(geoExcursion.getExcursionType().getActivityType());

        // Use this adapter for the waypoints for the excursion //
        WayPointAdapter wayPointAdapter = new WayPointAdapter(this, geoExcursion.getWayPoints());
        ListView listView = findViewById(R.id.wayPointListViewId);
        listView.setAdapter(wayPointAdapter);


    }


    public void onCompletedButtonClick(View button) {

        GeoTracker geoTracker = SharedPreferencesHelper.loadApplicationState(this);
        geoTracker.addToCompletedGeoExcursions(geoExcursion);
        SharedPreferencesHelper.saveApplicationState(this, geoTracker);


        Intent intent = new Intent(this, CompletedExcursionActivity.class);
        intent.putExtra("completedGeoexcursion", this.geoExcursion);

        startActivity(intent);
    }

    public void onRemoveExcursionButtonClicked(View button) {

        GeoTracker geoTracker = SharedPreferencesHelper.loadApplicationState(this);
        geoTracker.removeGeoExcursion(geoExcursion);
        SharedPreferencesHelper.saveApplicationState(this, geoTracker);

        Intent intent = new Intent(this, FindWalkActivity.class);

        startActivity(intent);

    }


}
