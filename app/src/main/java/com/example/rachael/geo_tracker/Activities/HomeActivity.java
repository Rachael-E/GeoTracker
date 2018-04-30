package com.example.rachael.geo_tracker.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.rachael.geo_tracker.R;

public class HomeActivity extends AppCompatActivity {

    Button findWalkButton;
    Button completedWalkButton;
    Button newWalkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findWalkButton = findViewById(R.id.findAWalkButtonId);
        completedWalkButton = findViewById(R.id.viewCompletedWalksButtonId);
        newWalkButton = findViewById(R.id.createNewWalkButtonId);
    }


    public void onFindExcursionButtonClicked(View button){
        Log.d(getClass().toString(), "onFindWalkButton was called");

        Intent intent = new Intent( this, FindWalkActivity.class);

//        intent.putExtra("excursions", excursions);
        startActivity(intent);
    }
}



