package com.example.rachael.geo_tracker.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.R;
import com.example.rachael.geo_tracker.SeedFile.GeoActivitySeed;

import java.util.ArrayList;

public class FindWalkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_walk);

        GeoActivitySeed excursions = new GeoActivitySeed();
        ArrayList<GeoExcursion> excursionList = excursions.getList();

        ExcursionSeedAdapter excursionAdapter = new ExcursionSeedAdapter(this, excursionList);

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
