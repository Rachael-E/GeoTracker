package com.example.rachael.geo_tracker.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.Models.WayPoints;
import com.example.rachael.geo_tracker.R;

import java.util.ArrayList;

public class NewExcursionActivity extends AppCompatActivity {

    GeoExcursion geoExcursionToAdd;
    GeoTracker geoTracker;
    WayPoints wayPointsToAdd;
    private EditText excursionTitle;
    private EditText excursionSummary;
    private EditText excursionWayPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_excursion);

        excursionTitle = findViewById(R.id.editExcursionTitleId);
        excursionSummary = findViewById(R.id.editExcursionSummaryId);
        excursionWayPoint = findViewById(R.id.editWayPointId);




    }

//    public void onSaveExcursionButtonClicked(View button) {
//
//        String getExcursionTitle = excursionTitle.getText().toString();
//        String getExcursionSummary = excursionTitle.getText().toString();
//        String getWayPoint = excursionTitle.getText().toString();
//
//
//        ArrayList<WayPoints> =
//        wayPointsToAdd.setDescription();
//
//        geoExcursionToAdd.setTitle(getExcursionTitle);
//        geoExcursionToAdd.setTitle(getExcursionSummary);
//        geoExcursionToAdd.setWayPoints();
//
//
//
//
//    }




}
