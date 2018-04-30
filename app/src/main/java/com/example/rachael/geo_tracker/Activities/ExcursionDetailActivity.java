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
        excursionEraTextView.setText(geoExcursion.getGeologyInfo().get(0).getEraTypes().get(0).getGeologyPeriod());

        TextView excursionRockTextView = findViewById(R.id.rockTypeTextViewId);
        excursionRockTextView.setText(geoExcursion.getGeologyInfo().get(0).getRockTypes().get(0).getRockType());

        TextView excursionType = findViewById(R.id.excursionDetailTypeTextViewId);
        excursionType.setText(geoExcursion.getExcursionType().getActivityType());
    }
}
