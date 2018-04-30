package com.example.rachael.geo_tracker.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.R;

public class ExcursionDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excursion_detail);

        Intent intent = getIntent();
        GeoExcursion geoExcursion = (GeoExcursion) intent.getSerializableExtra("geoexcursion");


        TextView excursionTitleTextView = findViewById(R.id.excursionDetailTitleTextViewId);
        excursionTitleTextView.setText(geoExcursion.getTitle());

        // tidy this up to make a method in geology info which returns all era types with name and period age
        TextView excursionEraTextView = findViewById(R.id.eraTypeTextViewId);
        String returnGeologyPeriod = geoExcursion.getGeologyInfo().get(0).getEraTypes().get(0).getGeologyPeriod();
        excursionEraTextView.setText(returnGeologyPeriod);

    // Set up for loop to get the appropriate components
        TextView excursionRockTextView = findViewById(R.id.rockTypeTextViewId);
        String getFirstRockType = geoExcursion.getGeologyInfo().get(0).getRockTypes().get(0).getRockType();
        //String getSecondRockType = geoExcursion.getGeologyInfo().get(0).getRockTypes().get(1).getRockType();
        //String rockTypes = getFirstRockType + ", " + getSecondRockType;
        excursionRockTextView.setText(getFirstRockType);

        TextView excursionType = findViewById(R.id.excursionDetailTypeTextViewId);
        excursionType.setText(geoExcursion.getExcursionType().getActivityType());
    }
}
