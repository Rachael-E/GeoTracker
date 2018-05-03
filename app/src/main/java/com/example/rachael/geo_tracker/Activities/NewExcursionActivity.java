package com.example.rachael.geo_tracker.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoInfo;
import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.Models.WayPoints;
import com.example.rachael.geo_tracker.R;
import com.example.rachael.geo_tracker.SharedPreferences.SharedPreferencesHelper;
import com.example.rachael.geo_tracker.Types.EraType;
import com.example.rachael.geo_tracker.Types.ExcursionType;
import com.example.rachael.geo_tracker.Types.RockType;

import java.util.ArrayList;

public class NewExcursionActivity extends AppCompatActivity {

    ArrayList<WayPoints> newArrayListOfWayPoints;
    WayPoints wayPointStringToAdd;
    RockType rockType;
    EraType eraType;
    ArrayList<EraType> eraTypeArrayList;
    ArrayList<RockType> rockTypeArrayList;
    GeoInfo geoInfo;
    ArrayList<GeoInfo> geoInfoArrayList;
    ExcursionType excursionType;
    boolean isComplete = true;

    private EditText excursionTitle;
    private EditText excursionSummary;
    private EditText excursionWayPoint;

    private CheckBox quaternaryCheckBox;
    private CheckBox palaeogeneCheckBox;
    private CheckBox jurassicCheckBox;
    private CheckBox triassicCheckBox;

    private CheckBox basaltCheckBox;
    private CheckBox sandstoneCheckBox;
    private CheckBox mudstoneCheckBox;

    private RadioButton walkButton;
    private RadioButton incompleteButton;

    ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_excursion);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#838c6b")));

        excursionTitle = findViewById(R.id.editExcursionTitleId);
        excursionSummary = findViewById(R.id.editExcursionSummaryId);
        excursionWayPoint = findViewById(R.id.editWayPointId);

        quaternaryCheckBox = findViewById(R.id.checkBoxQuaternary);
        palaeogeneCheckBox = findViewById(R.id.checkBoxPalaeogene);
        jurassicCheckBox = findViewById(R.id.checkBoxJurassic);
        triassicCheckBox = findViewById(R.id.checkBoxTriassic);

        basaltCheckBox = findViewById(R.id.checkBoxBasalt);
        sandstoneCheckBox = findViewById(R.id.checkBoxSandstone);
        mudstoneCheckBox = findViewById(R.id.checkBoxMudstone);

        walkButton = findViewById(R.id.radioButtonWalk);
        incompleteButton = findViewById(R.id.radioButtonNotComplete);

        rockTypeArrayList = new ArrayList<>();
        eraTypeArrayList = new ArrayList<>();
        geoInfoArrayList = new ArrayList<>();
        newArrayListOfWayPoints = new ArrayList<>();

    }

    public void onRadioButtonClicked(View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButtonWalk:
                if (checked)
//                    ExcursionType.valueOf(walkButton.getText().toString().toUpperCase());
                excursionType = ExcursionType.WALK;


                // this would return a string of False: but how to make that a boolean without the text saying false?
            case R.id.radioButtonNotComplete:
                if (checked) isComplete = false;

        }
    }

    public void onCheckBoxClicked(View view){

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBoxQuaternary:
                if (checked)
//                    eraTypeArrayList.add(EraType.valueOf(quaternaryCheckBox.getText().toString().toUpperCase()));
                    eraTypeArrayList.add(EraType.QUATERNARY);
                break;

            case R.id.checkBoxPalaeogene:
                if (checked)
                    eraTypeArrayList.add(EraType.PALAEOGENE);
                break;


            case R.id.checkBoxJurassic:
                if (checked)
                    eraTypeArrayList.add(EraType.JURASSIC);
                break;


            case R.id.checkBoxTriassic:
                if (checked)
                    eraTypeArrayList.add(EraType.TRIASSIC);
                break;


            case R.id.checkBoxBasalt:
                if (checked)
                    rockTypeArrayList.add(RockType.BASALT);
                break;


            case R.id.checkBoxSandstone:
                if (checked)
                    rockTypeArrayList.add(RockType.SANDSTONE);
                break;


            case R.id.checkBoxMudstone:
                if (checked)
                rockTypeArrayList.add(RockType.MUDSTONE);
                break;



        }
    }


    public void onSaveExcursionButtonClicked(View button) {

        String getExcursionTitle = excursionTitle.getText().toString();
        String getExcursionSummary = excursionSummary.getText().toString();
        String wayPointString = excursionWayPoint.getText().toString();

        wayPointStringToAdd = new WayPoints(wayPointString);
        newArrayListOfWayPoints.add(wayPointStringToAdd);

        geoInfo = new GeoInfo(eraTypeArrayList, rockTypeArrayList);
        geoInfoArrayList.add(geoInfo);




        // get an enum when a checkbox is clicked
        // set that enum into GeoInfo
        // add the geoInfo into geoExcursion

//        EraType getEraType = quaternaryCheckBox.getEraEnum;
//        eraType.setGeologyPeriod(getEraType.getGeologyPeriod());


//        quaternaryCheckBox = eraType.setGeologyPeriod();

        GeoExcursion geoExcursionToAdd = new GeoExcursion();
        geoExcursionToAdd.setTitle(getExcursionTitle);
        geoExcursionToAdd.setSummary(getExcursionSummary);
        geoExcursionToAdd.setWayPoints(newArrayListOfWayPoints);
        geoExcursionToAdd.setGeologyInfo(geoInfoArrayList);
        geoExcursionToAdd.setExcursionType(excursionType);
        geoExcursionToAdd.setComplete(isComplete);

        GeoTracker geoTracker = SharedPreferencesHelper.loadApplicationState(this);
        geoTracker.addGeoExcursions(geoExcursionToAdd);

        SharedPreferencesHelper.saveApplicationState(this, geoTracker);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

    }




}
